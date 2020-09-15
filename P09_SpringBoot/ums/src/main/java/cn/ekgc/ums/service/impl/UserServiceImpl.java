package cn.ekgc.ums.service.impl;

import cn.ekgc.ums.dao.UserDao;
import cn.ekgc.ums.pojo.entity.User;
import cn.ekgc.ums.pojo.vo.Page;
import cn.ekgc.ums.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>用户业务层接口实现类</b>
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	/**
	 * <b>获得分页对象</b>
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@Override
	public Page<User> getPage(Page<User> page) throws Exception {
		// 创建 PageHelper 分页对象
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		// 进行列表查询
		List<User> list = userDao.findListByQuery(new User());
		// 根据获得的列表创建 PageInfo 对象
		PageInfo<User> pageInfo = new PageInfo<User>(list);

		// 提取数据
		page.setList(pageInfo.getList());
		page.setTotalCount(pageInfo.getTotal());
		page.setTotalPage(pageInfo.getPages());

		return page;
	}

	/**
	 * <b>修改对象</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(User user) throws Exception {
		Integer count = userDao.update(user);
		if (count > 0) {
			return true;
		}
		return false;
	}
}

package cn.ekgc.user.service.impl;

import cn.ekgc.user.dao.UserDao;
import cn.ekgc.user.pojo.entity.User;
import cn.ekgc.user.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <b>用户功能业务层接口</b>
 * @author Arthur
 * @version 4.1.0
 * @since 2.0.0
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	private UserDao userDao;

	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(User user) throws Exception {
		int count = userDao.save(user);

		if (count > 0) {
			return true;
		}

		return false;
	}
}

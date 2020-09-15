package cn.ekgc.ums.service;

import cn.ekgc.ums.pojo.entity.User;
import cn.ekgc.ums.pojo.vo.Page;

/**
 * <b>用户业务层接口</b>
 */
public interface UserService {
	/**
	 * <b>获得分页对象</b>
	 * @param page
	 * @return
	 * @throws Exception
	 */
	Page<User> getPage(Page<User> page) throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	boolean update(User user) throws Exception;
}

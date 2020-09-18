package cn.ekgc.user.service;

import cn.ekgc.user.pojo.entity.User;

/**
 * <b>用户功能业务层接口</b>
 * @author Arthur
 * @version 4.1.0
 * @since 2.0.0
 */
public interface UserService {

	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	boolean save(User user) throws Exception;
}

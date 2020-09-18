package cn.ekgc.user.controller;

import cn.ekgc.user.pojo.entity.User;
import cn.ekgc.user.transport.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <b>用户功能控制器</b>
 * @author Arthur
 * @version 4.1.0
 * @since 2.0.0
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserTransport userTransport;

	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	@ResponseBody
	public boolean save(User user) throws Exception {
		return userTransport.save(user);
	}
}

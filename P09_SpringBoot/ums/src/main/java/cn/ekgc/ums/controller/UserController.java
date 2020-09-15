package cn.ekgc.ums.controller;

import cn.ekgc.ums.controller.base.BaseController;
import cn.ekgc.ums.pojo.entity.User;
import cn.ekgc.ums.pojo.vo.Page;
import cn.ekgc.ums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <b>用户控制器</b>
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController extends BaseController {
	@Autowired
	private UserService userService;

	/**
	 * <b>转发到用户信息首页</b>
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/index")
	public String forwardIndexPage() throws Exception {
		return "user_index";
	}

	/**
	 * <b>获得分页对象</b>
	 * @param pageNum
	 * @param pageSize
	 * @param draw
	 * @return
	 */
	@PostMapping("/page")
	@ResponseBody
	public Page<User> queryPage(Integer pageNum, Integer pageSize, Integer draw) throws Exception {
		// 封装分页对象 Page
		Page<User> page = new Page<User>(pageNum, pageSize, draw);
		// 进行分页查询
		page = userService.getPage(page);

		return page;
	}

	/**
	 * <b>修改用户状态</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/status")
	@ResponseBody
	public boolean changeStatus(User user) throws Exception {
		// 进行用户状态修改
		boolean flag = userService.update(user);
		return flag;
	}
}

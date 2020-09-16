package cn.ekgc.dubbo.controller;

import cn.ekgc.dubbo.demo.HelloDemo;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("helloController")
@RequestMapping("/hello")
public class HelloController {
	@DubboReference(version = "1.0.0")
	private HelloDemo helloDemo;

	@GetMapping("/say")
	@ResponseBody
	public String sayHello(String name) throws Exception {
		return helloDemo.sayHello(name);
	}
}

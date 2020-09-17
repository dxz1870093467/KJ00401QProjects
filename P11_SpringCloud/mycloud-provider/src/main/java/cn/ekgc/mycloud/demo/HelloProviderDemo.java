package cn.ekgc.mycloud.demo;

import cn.ekgc.mycloud.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController("helloProviderDemo")
@RequestMapping("/hello")
public class HelloProviderDemo {

	@PostMapping("/say")
	public String sayHello(@RequestParam String name) throws Exception {
		System.out.println("MyCloud Provder HelloProviderDemo:sayHello " + name + new Date());
		return "这是来自 mycloud-provider 的诚挚问候，阿豪再次祝" + name + "老实人快乐！";
	}

	@PostMapping("/marry")
	public String marry(@RequestBody User user) throws Exception {
		return "恭喜" + user.getName() + "新婚快乐！";
	}
}

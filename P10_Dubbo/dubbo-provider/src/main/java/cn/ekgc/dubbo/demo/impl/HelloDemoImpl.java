package cn.ekgc.dubbo.demo.impl;

import cn.ekgc.dubbo.demo.HelloDemo;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Date;

@DubboService(version = "1.0.0")
public class HelloDemoImpl implements HelloDemo {

	@Override
	public String sayHello(String name) throws Exception {
		return "Hello " + name + " : " + new Date();
	}
}

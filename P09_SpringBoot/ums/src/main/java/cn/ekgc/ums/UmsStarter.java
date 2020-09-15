package cn.ekgc.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <b>UMS 项目启动器</b>
 */
@MapperScan("cn.ekgc.ums.dao")
@SpringBootApplication
public class UmsStarter {
	public static void main(String[] args) {
		SpringApplication.run(UmsStarter.class, args);
	}
}

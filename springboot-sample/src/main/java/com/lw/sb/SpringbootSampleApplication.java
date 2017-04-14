package com.lw.sb;

import com.lw.sb.dd.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// 指明加载哪个bean,这里不指明,在bean上指明也可以
@EnableConfigurationProperties({User.class})
public class SpringbootSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSampleApplication.class, args);
	}
}

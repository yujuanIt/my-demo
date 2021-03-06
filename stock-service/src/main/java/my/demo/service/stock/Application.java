package my.demo.service.stock;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"my.demo.service.stock", "my.demo.utils"})
@DubboComponentScan(basePackages = { "my.demo.service.stock" })
public class Application {
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(WebApplicationType.NONE).run(args);
	}
}
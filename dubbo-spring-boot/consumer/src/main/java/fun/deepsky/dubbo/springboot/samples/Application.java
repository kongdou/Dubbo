package fun.deepsky.dubbo.springboot.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@PropertySource("classpath:application.properties")
@ImportResource("classpath:/dubbo/consumer.xml")
public class Application  {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

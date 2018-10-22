package fun.deepsky.dubbo.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@ImportResource({ "classpath:dubbo/provider.xml" })
public class ProviderApplication {

	public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}

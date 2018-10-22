package fun.deepsky.dubbo.samples;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

public class Application {

	public static void main(String[] args) throws Exception {
			System.setProperty("java.net.preferIPv4Stack", "true");
			ReferenceConfig<GreetingService> referenceConfig = new ReferenceConfig<GreetingService>();
	        referenceConfig.setApplication(new ApplicationConfig("dubbo-demo-consumer"));
	        //referenceConfig.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
	        referenceConfig.setInterface(GreetingService.class);
	        referenceConfig.setUrl("localhost:20880");
	        GreetingService greetingService = referenceConfig.get();
	        System.out.println(greetingService.sayHello("world"));
	        /*
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
			context.start();
			
			GreetingService service = (GreetingService) context.getBean("demoService");
			System.out.println(service.sayHello("world"));
*/
	}

}

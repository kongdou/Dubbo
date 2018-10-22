package fun.deepsky.dubbo.samples;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

public class Application {

	public static void main(String[] args) throws Exception {
		System.setProperty("java.net.preferIPv4Stack", "true");
		ApplicationConfig config = new ApplicationConfig("dubbo-demo-provider");
		ServiceConfig<GreetingService> serviceConfig = new ServiceConfig<GreetingService>();
		serviceConfig.setApplication(config);
		 serviceConfig.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
		serviceConfig.setInterface(GreetingService.class);
		serviceConfig.setRef(new GreetingServiceImpl());
		serviceConfig.export();
		System.in.read();
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext(new String[] {"provider.xml"});
		 * context.start(); System.in.read();
		 */

	}

}

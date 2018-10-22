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
		
		//组播配置
		//serviceConfig.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
		
		//zokeeper配置
		RegistryConfig registryconfig = new RegistryConfig("localhost:2181");
		registryconfig.setProtocol("zookeeper");
		serviceConfig.setRegistry(registryconfig);
		
		serviceConfig.setInterface(GreetingService.class);
		serviceConfig.setRef(new GreetingServiceImpl());
		serviceConfig.export();
		System.in.read();
		
		/* 使用配置文件
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext(new String[] {"provider.xml"});
		 * context.start(); System.in.read();
		 */

	}

}

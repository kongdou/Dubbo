package fun.deepsky.dubbo.springboot.provider;

import com.alibaba.dubbo.config.annotation.Service;

import fun.deepsky.dubbo.springboot.api.DemoService;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "hello "+name;
	}
	
}

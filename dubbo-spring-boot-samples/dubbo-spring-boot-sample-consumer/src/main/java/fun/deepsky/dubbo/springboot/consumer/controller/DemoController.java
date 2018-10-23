package fun.deepsky.dubbo.springboot.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import fun.deepsky.dubbo.springboot.api.DemoService;

@RestController
public class DemoController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
	private DemoService demoService;
	
	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	public String sysHello(@RequestParam String name) {
		return demoService.sayHello(name);
	}
}

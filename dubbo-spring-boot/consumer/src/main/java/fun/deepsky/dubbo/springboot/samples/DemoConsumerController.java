package fun.deepsky.dubbo.springboot.samples;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
@Component
public class DemoConsumerController {

	@Reference
    private GreetingService greetingService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return greetingService.sayHello(name);
    }

}

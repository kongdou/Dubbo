package fun.deepsky.dubbo.springboot.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoConsumerController {

	@Autowired
    private GreetingService greetingService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return greetingService.sayHello(name);
    }

}

package fun.deepsky.dubbo.samples;

public class GreetingServiceImpl implements GreetingService{
	
	@Override
	public String sayHello(String name) {
		 return "Hello " + name;
	}
}

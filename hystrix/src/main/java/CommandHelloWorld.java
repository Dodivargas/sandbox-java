import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;

public class CommandHelloWorld extends HystrixCommand<String> {

    private final String name;
    private final Long time;

    public CommandHelloWorld(String name,Long time) {
        super(HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                        .withExecutionTimeoutInMilliseconds(1000)));
        this.name = name;
        this.time = time;
    }

    @Override
    protected String run() {
        try {
            Thread.sleep(time * 1000);
        }catch (InterruptedException e){

        }
        return "Hello " + name + "!";
    }

    @Override
    protected String getFallback(){
        return "Isso é um fallback";
    }
}

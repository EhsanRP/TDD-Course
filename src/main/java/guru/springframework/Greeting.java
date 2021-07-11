package guru.springframework;

import java.lang.reflect.Method;
import org.junit.platform.commons.util.ReflectionUtils;

public class Greeting {

    public String helloWorld(){
        return "Hello World";
    }

    public String helloWorld(String name){
        return "Hello " + name;
    }
}


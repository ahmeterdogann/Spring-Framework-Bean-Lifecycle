package dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@DependsOn({"beanA", "beanB"})
public class BeanC {
    public BeanC() {
        System.out.println("C()");
    }
}

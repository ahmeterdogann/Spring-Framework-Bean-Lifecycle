package dependson;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanB {
    public BeanB() {
        System.out.println("B()");
    }
}

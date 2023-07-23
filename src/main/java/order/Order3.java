package order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Order3 implements OrderableBean{
    public Order3() {
        System.out.println("Order3()");
    }
}

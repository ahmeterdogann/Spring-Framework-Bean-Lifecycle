package order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Order1 implements OrderableBean{
    public Order1() {
        System.out.println("Order1()");
    }
}

package order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1213123213)
public class Order4 implements OrderableBean{
    public Order4() {
        System.out.println("Order4()");
    }
}

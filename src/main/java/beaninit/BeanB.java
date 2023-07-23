package beaninit;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    public static int objCount;

    public BeanB() {
        objCount++;
        System.out.println("B() : " + objCount);
    }

    @Bean
    public int i () {
        //A'ya inject edilen i bean'ninde bu burası çağrılmadı neden çünkü config öncelikli
        System.out.println("B.i()");
        return 1;
    }
}

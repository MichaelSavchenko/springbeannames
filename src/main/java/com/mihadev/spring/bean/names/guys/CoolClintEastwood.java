package com.mihadev.spring.bean.names.guys;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("cool Clint Eastwood From Annotation")
@Order(3)
public class CoolClintEastwood implements CoolGuy {
    @Override
    public void saveTheEarth() {
        System.out.println("Clint Eastwood save the Earth");
    }
}

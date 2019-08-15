package com.mihadev.spring.bean.names.films;

import com.mihadev.spring.bean.names.guys.CoolGuy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("coolBoringMovie")
public class BoringFilm {

    private final CoolGuy coolGuy;

    public BoringFilm(@Qualifier("cool Clint Eastwood From Annotation") CoolGuy coolGuy) {
        this.coolGuy = coolGuy;
    }

    public void action() {
        coolGuy.saveTheEarth();
    }
}

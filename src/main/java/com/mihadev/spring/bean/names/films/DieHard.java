package com.mihadev.spring.bean.names.films;

import com.mihadev.spring.bean.names.guys.CoolGuy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DieHard implements BlockBuster {

    private final List<CoolGuy> coolGuys;

    public DieHard(List<CoolGuy> coolGuys) {
        this.coolGuys = coolGuys;
    }

    public void action() {
        coolGuys.forEach(CoolGuy::saveTheEarth);
    }
}

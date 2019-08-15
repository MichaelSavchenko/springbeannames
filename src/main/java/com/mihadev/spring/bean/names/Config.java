package com.mihadev.spring.bean.names;

import com.mihadev.spring.bean.names.films.BlockBuster;
import com.mihadev.spring.bean.names.films.DieHard;
import com.mihadev.spring.bean.names.guys.BruceWillis;
import com.mihadev.spring.bean.names.guys.ChuckNorris;
import com.mihadev.spring.bean.names.guys.CoolGuy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.util.List;

@Configuration
public class Config {

    @Bean
    public CoolGuy coolGuy() {
        return new ChuckNorris();
    }

    @Bean
    @Order(2)
    public CoolGuy coolChuckNorris() {
        return new ChuckNorris();
    }

    @Bean({"coolBruce", "coolWillis"})
    @Order(1)
    public CoolGuy bruceWillis() {
        return new BruceWillis();
    }

    @Bean("coolNameChuckNorris")
    public CoolGuy any() {
        return new ChuckNorris();
    }



    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public BlockBuster coolBlockBuster(CoolGuy coolBruce, CoolGuy coolChuckNorris, CoolGuy coolGuy) {
        return new DieHard(List.of(coolBruce, coolChuckNorris, coolGuy));
    }

    @Bean
    public BlockBuster coolBlockBusterQualifier(
            @Qualifier("coolBruce") CoolGuy coolGuy1,
            @Qualifier("coolChuckNorris") CoolGuy coolGuy2,
            @Qualifier("coolGuy") CoolGuy coolGuy3) {
        return new DieHard(List.of(coolGuy1, coolGuy2, coolGuy3));
    }

    @Bean
    public BlockBuster coolBlockBuster(List<CoolGuy> coolGuys) {
        return new DieHard(coolGuys);
    }
}

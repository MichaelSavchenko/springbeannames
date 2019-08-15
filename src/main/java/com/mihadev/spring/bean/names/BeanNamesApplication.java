package com.mihadev.spring.bean.names;

import com.mihadev.spring.bean.names.films.DieHard;
import com.mihadev.spring.bean.names.guys.BruceWillis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class BeanNamesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(BeanNamesApplication.class);

        /*Arrays.stream(ctx.getBeanDefinitionNames())
                .filter(beanName -> beanName.startsWith("cool"))
                .forEach(System.out::println);*/

        /*BruceWillis bruce = (BruceWillis) ctx.getBean("coolBruce");
        bruce.saveTheEarth();

        BruceWillis willis = (BruceWillis) ctx.getBean("coolWillis");
        willis.saveTheEarth();*/

        DieHard dieHard = (DieHard) ctx.getBean("dieHard"); // "coolBlockBuster"
        dieHard.action();

    }
}

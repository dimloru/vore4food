package ru.dimlo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.dimlo.controller.CustomerRestController;

import java.util.Arrays;

public class Prog {
    public static void main(String[] args) {


        try (ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring.xml")) {

            System.out.println("Bean definition names: " + Arrays.toString(appCtx.getBeanDefinitionNames()));

            CustomerRestController customerRestController = appCtx.getBean(CustomerRestController.class);
            System.out.println(CustomerRestController.class);

            customerRestController.print();
        }

    }
}

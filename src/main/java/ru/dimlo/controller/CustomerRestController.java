package ru.dimlo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import ru.dimlo.service.RestaurantService;
import ru.dimlo.service.UserService;

import java.util.Arrays;

@Controller
public class CustomerRestController {

    private RestaurantService restaurantService;

    private UserService userService;

    @Autowired
    public CustomerRestController(RestaurantService restaurantService, UserService userService) {
        this.restaurantService = restaurantService;
        this.userService = userService;
    }

    public CustomerRestController() {
    }

    public void print() {
        System.out.println(restaurantService.get());
        System.out.println(userService.get());
    }

}

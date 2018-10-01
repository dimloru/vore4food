package ru.dimlo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.dimlo.service.RestaurantService;
import ru.dimlo.service.UserService;

import java.util.Objects;

@Controller
public class AdminRestController {
    private RestaurantService restaurantService;
    private UserService userService;

    @Autowired
    public AdminRestController(RestaurantService restaurantService, UserService userService) {
        this.restaurantService = restaurantService;
        this.userService = userService;
    }

    private static Object o = new Object();

    public static void main(String[] args) {
        System.out.println(Objects.hash(o));
    }

}

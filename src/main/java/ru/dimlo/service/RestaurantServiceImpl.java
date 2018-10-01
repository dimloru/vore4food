package ru.dimlo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dimlo.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    public String get() {
        return restaurantRepository.get();
    }
}

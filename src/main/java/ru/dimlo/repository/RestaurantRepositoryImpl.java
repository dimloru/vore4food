package ru.dimlo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RestaurantRepositoryImpl implements RestaurantRepository {

    public String get() {
        return "Restaurant Repo";
    }
}

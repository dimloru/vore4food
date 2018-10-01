package ru.dimlo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    public String get() {
        return "User Repo";
    }
}

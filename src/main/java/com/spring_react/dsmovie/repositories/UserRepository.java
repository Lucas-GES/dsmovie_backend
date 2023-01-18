package com.spring_react.dsmovie.repositories;

import com.spring_react.dsmovie.entities.Movie;
import com.spring_react.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}

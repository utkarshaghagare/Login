package com.example.login.repo;

import com.example.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepositary extends JpaRepository<User, String> {
    @Query
    User findByUsername (@Param("")String usename);


    //String findByUsername(String x);
}

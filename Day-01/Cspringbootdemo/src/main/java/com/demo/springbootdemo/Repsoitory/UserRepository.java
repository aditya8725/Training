package com.demo.springbootdemo.Repsoitory;


import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springbootdemo.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

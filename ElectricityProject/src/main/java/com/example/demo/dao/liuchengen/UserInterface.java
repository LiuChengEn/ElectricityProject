package com.example.demo.dao.liuchengen;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserInterface extends JpaRepository<User, Integer> {

}

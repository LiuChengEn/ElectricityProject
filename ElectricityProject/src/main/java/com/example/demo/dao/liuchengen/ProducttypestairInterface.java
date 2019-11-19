package com.example.demo.dao.liuchengen;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Producttypestair;

public interface ProducttypestairInterface extends JpaRepository<Producttypestair, Integer> {
	List<Producttypestair> findByPid(Integer pid);
}

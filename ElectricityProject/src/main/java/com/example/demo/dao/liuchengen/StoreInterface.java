package com.example.demo.dao.liuchengen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.entity.Store;

public interface StoreInterface extends JpaRepository<Store, Integer>,JpaSpecificationExecutor<Store> {
	
}

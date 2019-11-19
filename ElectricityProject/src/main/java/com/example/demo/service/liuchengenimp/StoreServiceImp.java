package com.example.demo.service.liuchengenimp;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.demo.dao.liuchengen.StoreInterface;
import com.example.demo.entity.Store;

@Service
public class StoreServiceImp {
	@Autowired
	private StoreInterface storeInterface;
	//查询所有店铺
	public Page<Store> selectStores(Pageable pageable) { 
		return storeInterface.findAll(get(), pageable);
	}
	private Specification<Store> get(){
		return new Specification<Store>() {

			@Override
			public Predicate toPredicate(Root<Store> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				// TODO 自动生成的方法存根
				return null;
			}
			
		};
	}
}

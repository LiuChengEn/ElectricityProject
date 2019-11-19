package com.example.demo.service.liuchengenimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.liuchengen.ProducttypestairInterface;
import com.example.demo.entity.Producttypestair;

@Service
public class ProductTypeServiceImp {
	
	@Autowired
	private ProducttypestairInterface producttypestairInterface;
	//查询所有类别
	public Object selectProductTypes() {
		return producttypestairInterface.findAll();
	}
	//根据pid查询所有类别
	public List<Producttypestair> selectProductTypesYIJI(Integer pid) {
		return producttypestairInterface.findByPid(pid);
	}
	//添加类别
	public Producttypestair insertProductType(Producttypestair producttypestair) {
		return producttypestairInterface.saveAndFlush(producttypestair);
	}
	//删除类别
	public Integer deleteTypeById(Integer id) {
		try {
			producttypestairInterface.deleteById(id);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
}

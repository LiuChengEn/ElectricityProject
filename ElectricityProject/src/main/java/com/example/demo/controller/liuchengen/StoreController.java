package com.example.demo.controller.liuchengen;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Store;
import com.example.demo.service.liuchengenimp.StoreServiceImp;

@RestController
@CrossOrigin
public class StoreController {
	@Autowired
	private StoreServiceImp storeServiceImp;
	@PostMapping("/selectStores")
	public Object selectStores(Integer page,Integer limit) {
		
		Pageable pageable =PageRequest.of(page-1, limit);
		Page<Store> selectStores = storeServiceImp.selectStores(pageable);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", selectStores.getContent());
		map.put("count", selectStores.getTotalElements());
		return map;
	}
	
}

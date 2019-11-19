package com.example.demo.service.yuanleiimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.yuanlei.CartsMapper;
import com.example.demo.entity.Product;
import com.example.demo.entity.Productimg;
import com.example.demo.entity.Repertory;
import com.example.demo.entity.Shoppingtrolley;
import com.example.demo.entity.Useraddress;


@Service
public class CartServiceImp implements CartService {
	@Autowired
	private CartsMapper cartsMapper;

	@Override
	public List<Shoppingtrolley> selectShoppingtrolley(Integer uid) {
		// TODO Auto-generated method stub
		return cartsMapper.selectShoppingtrolley(uid);
	}

	@Override
	public Integer selectRepertory(Repertory repertory) {
		// TODO Auto-generated method stub
		return cartsMapper.selectRepertory(repertory);
	}

	@Override
	public Product selectProductBypid(Integer pid) {
		// TODO Auto-generated method stub
		return cartsMapper.selectProductBypid(pid);
	}

	@Override
	public List<Productimg> selectProductImgBypid(Integer pid) {
		// TODO Auto-generated method stub
		return cartsMapper.selectProductImgBypid(pid);
	}

	@Override
	public Useraddress selectaddress(Integer uid) {
		// TODO Auto-generated method stub
		return cartsMapper.selectaddress(uid);
	}

	@Override
	public List<Useraddress> selectAlladdress(Integer uid) {
		// TODO Auto-generated method stub
		return cartsMapper.selectAlladdress(uid);
	}

	


}

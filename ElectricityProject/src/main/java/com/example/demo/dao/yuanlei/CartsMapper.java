package com.example.demo.dao.yuanlei;

import java.util.List;

import com.example.demo.entity.Product;
import com.example.demo.entity.Productimg;
import com.example.demo.entity.Repertory;
import com.example.demo.entity.Shoppingtrolley;
import com.example.demo.entity.Useraddress;

public interface CartsMapper {
	
	//根据用户id查询购物车
	List<Shoppingtrolley> selectShoppingtrolley(Integer uid);
	
	//查询商品库存
	Integer selectRepertory(Repertory repertory);
	
	//根据产品id查询商品
	Product selectProductBypid(Integer pid);
	
	//根据产品id查询商品图片
 	List<Productimg> selectProductImgBypid(Integer pid);
 	
 	//根据用户id查询地址
 	Useraddress selectaddress(Integer uid);
 	//根据用户id查询所有地址
 	List<Useraddress> selectAlladdress(Integer uid);
 	
}

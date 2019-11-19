package com.example.demo.controller.yuanlei;

import java.util.List;

import javax.print.attribute.standard.PDLOverrideSupported;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.entity.Productimg;
import com.example.demo.entity.Repertory;
import com.example.demo.entity.Shoppingtrolley;
import com.example.demo.entity.Useraddress;
import com.example.demo.service.yuanleiimp.CartService;

@RestController
@CrossOrigin
public class CartController {

	@Autowired
	private CartService cartService;
	
	@GetMapping("/selectShoppingtrolley")
	public List<Shoppingtrolley> selectCartAll(String username){
		List<Shoppingtrolley> selectCartAll = cartService.selectShoppingtrolley(1);
		return selectCartAll;
	}
	
	@GetMapping("/selectRepertory")
	public Integer selectRepertory(Repertory repertory){
		Integer selectCartAll = cartService.selectRepertory(repertory);
		return selectCartAll;
	}
	
	@GetMapping("/selectProductBypid")
	public Product selectProductBypid(Integer pid){
		System.out.println(cartService.selectProductBypid(pid));
		return cartService.selectProductBypid(pid);
	}
	@GetMapping("/selectProductImgBypid")
	public List<Productimg> selectProductImgBypid(Integer pid){
		System.out.println(cartService.selectProductImgBypid(pid));
		return cartService.selectProductImgBypid(pid);
	}
	@GetMapping("/createOrder")
	public List<Productimg> createOrder(String pidList,Integer uid){
		String[] strArray = null;   
		strArray = pidList.split(",");
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		return null;
	}
	@GetMapping("/selectaddress")
	public Useraddress selectaddress(Integer uid){
		Useraddress selectaddress = cartService.selectaddress(uid);
		return selectaddress;
	}
	
	@GetMapping("/selectAlladdress")
	public List<Useraddress> selectAlladdress(Integer uid){
		 List<Useraddress> selectAlladdress = cartService.selectAlladdress(uid);
		 System.out.println(selectAlladdress);
		return selectAlladdress;
	}
}

package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
public class Shoppingtrolley {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer productnum;
	private String productmodel;
	@Transient
	private Integer userid;
	@Transient
	private Integer productid;
	
	@ManyToOne
	@JoinColumn(name = "userid",referencedColumnName = "id")
	private User user;
	@ManyToOne
	@JoinColumn(name = "productid",referencedColumnName = "id")
	private Product product;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductnum() {
		return productnum;
	}
	public void setProductnum(Integer productnum) {
		this.productnum = productnum;
	}
	public String getProductmodel() {
		return productmodel;
	}
	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}

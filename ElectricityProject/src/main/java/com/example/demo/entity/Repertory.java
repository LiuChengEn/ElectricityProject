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
public class Repertory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer repertorynum;
	private String productmodel;
	@Transient
	private Integer productid;
	@ManyToOne
	@JoinColumn(name = "productid",referencedColumnName = "id")
	private Product product;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRepertorynum() {
		return repertorynum;
	}
	public void setRepertorynum(Integer repertorynum) {
		this.repertorynum = repertorynum;
	}
	public String getProductmodel() {
		return productmodel;
	}
	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}

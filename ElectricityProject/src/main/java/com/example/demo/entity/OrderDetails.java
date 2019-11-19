package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer repertorynum;
	private String productmodel;
	@ManyToOne
	@JoinColumn(name = "orderid",referencedColumnName = "id")
	private ProductOrder productOrder;
	@ManyToOne
	@JoinColumn(name = "productid",referencedColumnName = "id")
	private Product product;
}

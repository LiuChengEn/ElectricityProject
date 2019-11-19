package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
public class ProductOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String order_no;
	private Double payment;
	private String paymenttype;
	private Integer postage;
	private String status;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date paymenttime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date enttime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createtime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updatetime;
	@ManyToOne
	@JoinColumn(name = "userid",referencedColumnName = "id")
	private User user;
}

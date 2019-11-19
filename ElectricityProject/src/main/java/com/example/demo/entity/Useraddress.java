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
public class Useraddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String province;
	private String city;
	private String county;
	private String postcode;
	private String consignee;
	private String consigneetel;
	private String detailedaddress;
	@ManyToOne
	@JoinColumn(name = "userid",referencedColumnName = "id")
	private User user;
	
	
	
}

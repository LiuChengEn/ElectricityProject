package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String certificatetype;
	private String idnumber;
	private String phone;
	private String email;
	private String sex;
	private String userpoint;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date registertime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date birthday;
	private Double usermoney;
	@OneToOne
	@JoinColumn(name = "userid",referencedColumnName = "id")
	private Userlogin userlogin;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCertificatetype() {
		return certificatetype;
	}
	public void setCertificatetype(String certificatetype) {
		this.certificatetype = certificatetype;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUserpoint() {
		return userpoint;
	}
	public void setUserpoint(String userpoint) {
		this.userpoint = userpoint;
	}
	public Date getRegistertime() {
		return registertime;
	}
	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Double getUsermoney() {
		return usermoney;
	}
	public void setUsermoney(Double usermoney) {
		this.usermoney = usermoney;
	}
	public Userlogin getUserlogin() {
		return userlogin;
	}
	public void setUserlogin(Userlogin userlogin) {
		this.userlogin = userlogin;
	}
	
}

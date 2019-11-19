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
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private Double price;
	private Integer salesvolume;
	private Integer pageview;
	@Transient
	private Integer storeproducttypeid;
	private Double discount;
	private Integer sales;
	private Integer browse;
	private String pimg;
	@ManyToOne
	@JoinColumn(name = "storeproducttypeid",referencedColumnName = "id")
	private Storeproducttype storeproducttype;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getSalesvolume() {
		return salesvolume;
	}
	public void setSalesvolume(Integer salesvolume) {
		this.salesvolume = salesvolume;
	}
	public Integer getPageview() {
		return pageview;
	}
	public void setPageview(Integer pageview) {
		this.pageview = pageview;
	}
	public Integer getStoreproducttypeid() {
		return storeproducttypeid;
	}
	public void setStoreproducttypeid(Integer storeproducttypeid) {
		this.storeproducttypeid = storeproducttypeid;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public Integer getBrowse() {
		return browse;
	}
	public void setBrowse(Integer browse) {
		this.browse = browse;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public Storeproducttype getStoreproducttype() {
		return storeproducttype;
	}
	public void setStoreproducttype(Storeproducttype storeproducttype) {
		this.storeproducttype = storeproducttype;
	}
	
}

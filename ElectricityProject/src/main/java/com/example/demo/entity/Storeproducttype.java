package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

/**
 * 店铺商品类别
 * @author admin
 *
 */
@Entity
@Data
public class Storeproducttype {
	/**商品类别id*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**店铺商品类别名称*/
	private String storeproducttypename;
	@ManyToOne
	@JoinColumn(name = "producttypestairid",referencedColumnName = "id")
	private Producttypestair producttypestair;
	@ManyToOne
	@JoinColumn(name = "storeid",referencedColumnName = "id")
	private Store store;
}

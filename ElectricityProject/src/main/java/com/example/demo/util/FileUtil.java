package com.example.demo.util;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil implements Serializable {
	private MultipartFile file;
	private String producttypestairname;
	private Integer pid;
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getProducttypestairname() {
		return producttypestairname;
	}
	public void setProducttypestairname(String producttypestairname) {
		this.producttypestairname = producttypestairname;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public FileUtil(MultipartFile file, String producttypestairname, Integer pid) {
		super();
		this.file = file;
		this.producttypestairname = producttypestairname;
		this.pid = pid;
	}
	public FileUtil() {
		super();
	}
}

package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "AddressDto : 시군동정보", description = "시군동의 정보를 나타낸다.")
public class AddressDto {
	
	@ApiModelProperty(value = "시군동번호")
	private int no;
	@ApiModelProperty(value = "시군동")
	private String address;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
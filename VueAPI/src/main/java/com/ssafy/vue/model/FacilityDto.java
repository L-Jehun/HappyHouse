package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "FacilityDto : 편의시설정보", description = "편의시설의 정보를 나타낸다.")
public class FacilityDto {

	@ApiModelProperty(value = "의미없음")
	private int no;
	@ApiModelProperty(value = "시도")
	private String sido;
	@ApiModelProperty(value = "구군")
	private String gugun;
	@ApiModelProperty(value = "동")
	private String dong;
	@ApiModelProperty(value = "편의시설")
	private String facility;
	@ApiModelProperty(value = "편의시설 개수")
	private int count;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSido() {
		return sido;
	}

	public void setSido(String sido) {
		this.sido = sido;
	}

	public String getGugun() {
		return gugun;
	}

	public void setGugun(String gugun) {
		this.gugun = gugun;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
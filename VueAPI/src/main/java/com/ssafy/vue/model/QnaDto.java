package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "QnaDto : 1:1문의", description = "1:1문의 상세 정보를 나타낸다.")
public class QnaDto {

	@ApiModelProperty(value = "1:1문의 번호")
	private int no;
	@ApiModelProperty(value = "아이디")
	private String userid;
	@ApiModelProperty(value = "제목")
	private String title;
	@ApiModelProperty(value = "내용")
	private String content;
	@ApiModelProperty(value = "답변")
	private String answer;
	@ApiModelProperty(value = "작성일")
	private String regtime;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

}

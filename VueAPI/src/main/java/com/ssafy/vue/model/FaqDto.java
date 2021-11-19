package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "FaqDto : 자주묻는질문", description = "자주묻는질문의 상세 정보를 나타낸다.")
public class FaqDto {
	
	@ApiModelProperty(value = "자주묻는질문 번호")
	private int no;
	@ApiModelProperty(value = "자주묻는질문")
	private String question;
	@ApiModelProperty(value = "답변")
	private String answer;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}

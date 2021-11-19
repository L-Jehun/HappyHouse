package com.ssafy.vue.model.service;

import java.util.List;


import com.ssafy.vue.model.FaqDto;

public interface FaqService {

	// 자주 묻는 질문 등록
	public boolean writeFaq(FaqDto faqDto) throws Exception;
	// 자주 묻는 질문 삭제
	public boolean deleteFaq(int no) throws Exception;
	// 자주 묻는 질문 수정
	public boolean modifyFaq(FaqDto faqDto) throws Exception;
	// 자주 묻는 질문 조회
	public List<FaqDto> listFaq() throws Exception;
	// 자주 묻는 질문 상세 조회
	public FaqDto getFaq(int no) throws Exception;
	
}

package com.ssafy.vue.model.service;

import java.util.List;

import com.ssafy.util.PageNavigation;
import com.ssafy.vue.model.NoticeDto;
import com.ssafy.vue.model.ParameterDto;

public interface NoticeService {
	
	// 공지사항 등록
	public boolean writeNotice(NoticeDto noticeDto) throws Exception;
	// 공지사항 삭제
	public boolean deleteNotice(int no) throws Exception;
	// 공지사항 수정
	public boolean modifyNotice(NoticeDto noticeDto) throws Exception;
	// 공지사항 상세 조회
	public NoticeDto getNotice(int no) throws Exception;
	// 공지사항 조회
	public List<NoticeDto> listNotice(ParameterDto parameterDto) throws Exception;
	public PageNavigation makePageNavigation(ParameterDto parameterDto) throws Exception;
	
}

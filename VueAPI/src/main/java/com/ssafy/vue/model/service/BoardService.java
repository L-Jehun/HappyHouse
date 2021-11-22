package com.ssafy.vue.model.service;

import java.util.List;

import com.ssafy.util.PageNavigation;
import com.ssafy.vue.model.BoardDto;
import com.ssafy.vue.model.ParameterDto;

public interface BoardService {
	public boolean writeArticle(BoardDto boardDto) throws Exception;
	public boolean deleteArticle(int articleno) throws Exception;
	public boolean modifyArticle(BoardDto boardDto) throws Exception;
	public BoardDto getArticle(int articleno) throws Exception;
	public void updateHit(int articleno) throws Exception;
	
	public List<BoardDto> listArticle(ParameterDto parameterDto) throws Exception;
	public PageNavigation makePageNavigation(ParameterDto parameterDto) throws Exception;
	
}

package com.ssafy.vue.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.model.QnaDto;
import com.ssafy.vue.model.service.QnaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/qna")
@Api("1:1문의 컨트롤러  API V1")
public class QnaController {

	public static final Logger logger = LoggerFactory.getLogger(QnaController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	

	@Autowired
	private QnaService qnaService;

	@ApiOperation(value = "1:1문의 질문 작성", notes = "1:1문의 질문 정보를 입력한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PostMapping("/question")
	public ResponseEntity<String> writeQuestion(@RequestBody @ApiParam(value = "1:1문의  정보.", required = true) QnaDto qaqDto) throws Exception {
		logger.info("writeFaq - 호출");
		if (qnaService.writeQuestion(qaqDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@ApiOperation(value = "1:1문의 답변 작성", notes = "1:1문의 답변 정보를 입력한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("/answer")
	public ResponseEntity<String> writeAnswer(@RequestBody @ApiParam(value = "1:1문의  정보", required = true) QnaDto qaqDto) throws Exception {
		logger.info("writeAnswer - 호출");
		if (qnaService.writeAnswer(qaqDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@ApiOperation(value = "1:1문의 질문 삭제", notes = "1:1문의번호에 해당하는 게시글의 질문 정보를 삭제한다. 그리고 DB삭제 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@DeleteMapping("/{no}")
	public ResponseEntity<String> deleteQna(@PathVariable("no") @ApiParam(value = "삭제할 글의 글번호.", required = true) int no) throws Exception {
		logger.info("deleteQna - 호출");
		if (qnaService.deleteQna(no)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@ApiOperation(value = "1:1문의 답변 삭제", notes = "1:1문의번호에 해당하는 게시글의 답변 정보를 삭제한다. 그리고 DB삭제 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("/{no}")
	public ResponseEntity<String> deleteAnswer(@PathVariable("no") @ApiParam(value = "삭제할 글의 글번호.", required = true) int no) throws Exception {
		logger.info("deleteAnswer - 호출");
		if (qnaService.deleteAnswer(no)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@ApiOperation(value = "1:1문의 질문 글수정", notes = "1:1문의 질문 정보를 수정한다. 그리고 DB수정 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("/modify/question")
	public ResponseEntity<String> modifyQuestion(@RequestBody @ApiParam(value = "1:1문의 질문 글정보.", required = true) QnaDto qaqDto) throws Exception {
		logger.info("modifyQuestion - 호출");
		if (qnaService.modifyQuestion(qaqDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.OK);
	}
	
	@ApiOperation(value = "1:1문의 답변 글수정", notes = "1:1문의 답변 정보를 수정한다. 그리고 DB수정 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("/modify/answer")
	public ResponseEntity<String> modifyAnswer(@RequestBody @ApiParam(value = "1:1문의 답변 글정보.", required = true) QnaDto qaqDto) throws Exception {
		logger.info("modifyAnswer - 호출");
		if (qnaService.modifyAnswer(qaqDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.OK);
	}
	
	@ApiOperation(value = "1:1문의 정보 리스트", notes = "1:1문의 정보 리스트를 반환한다.", response = List.class)
	@GetMapping("/list")
	public ResponseEntity<List<QnaDto>> listQna() throws Exception {
		logger.info("listQna - 호출");
		return new ResponseEntity<List<QnaDto>>(qnaService.listQna(), HttpStatus.OK);
	}
	
	@ApiOperation(value = "1:1문의 글보기", notes = "번호에 해당하는 1:1문의 정보를 반환한다.", response = QnaDto.class)
	@GetMapping("/{no}")
	public ResponseEntity<QnaDto> getQna(@PathVariable("no") @ApiParam(value = "얻어올 1:1문의 글번호.", required = true) int no) throws Exception {
		logger.info("getQna - 호출 : " + no);
		return new ResponseEntity<QnaDto>(qnaService.getQna(no), HttpStatus.OK);
	}
	

	

	
}

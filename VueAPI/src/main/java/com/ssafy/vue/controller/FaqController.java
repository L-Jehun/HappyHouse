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


import com.ssafy.vue.model.FaqDto;
import com.ssafy.vue.model.service.FaqService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/faq")
@Api("자주묻는질문 컨트롤러  API V1")
public class FaqController {

	public static final Logger logger = LoggerFactory.getLogger(FaqController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	

	@Autowired
	private FaqService faqService;

	@ApiOperation(value = "자주묻는질문 글작성", notes = "새로운 자주묻는질문 정보를 입력한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PostMapping
	public ResponseEntity<String> writeFaq(@RequestBody @ApiParam(value = "게시글 정보.", required = true) FaqDto faqDto) throws Exception {
		logger.info("writeFaq - 호출");
		if (faqService.writeFaq(faqDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@ApiOperation(value = "자주묻는질문 정보 리스트", notes = "자주묻는질문 정보 리스트를 반환한다.", response = List.class)
	@GetMapping("/list")
	public ResponseEntity<List<FaqDto>> listFaq() throws Exception {
		logger.info("listFaq - 호출");
		return new ResponseEntity<List<FaqDto>>(faqService.listFaq(), HttpStatus.OK);
	}
	
	@ApiOperation(value = "자주묻는질문 글보기", notes = "번호에 해당하는 자주묻는질문의 정보를 반환한다.", response = FaqDto.class)
	@GetMapping("/{no}")
	public ResponseEntity<FaqDto> getFaq(@PathVariable("no") @ApiParam(value = "얻어올 자주묻는질문의 글번호.", required = true) int no) throws Exception {
		logger.info("getFaq - 호출 : " + no);
		return new ResponseEntity<FaqDto>(faqService.getFaq(no), HttpStatus.OK);
	}
	
	@ApiOperation(value = "자주묻는질문 글수정", notes = "자주묻는질문 정보를 수정한다. 그리고 DB수정 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping
	public ResponseEntity<String> modifyFaq(@RequestBody @ApiParam(value = "자주묻는질문 글정보.", required = true) FaqDto faqDto) throws Exception {
		logger.info("modifyFaq - 호출");
		if (faqService.modifyFaq(faqDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.OK);
	}
	
	@ApiOperation(value = "자주묻는질문 글삭제", notes = "자주묻는질문번호에 해당하는 게시글의 정보를 삭제한다. 그리고 DB삭제 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@DeleteMapping("/{no}")
	public ResponseEntity<String> deleteFaq(@PathVariable("no") @ApiParam(value = "삭제할 글의 글번호.", required = true) int no) throws Exception {
		logger.info("deleteFaq - 호출");
		if (faqService.deleteFaq(no)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
}

package com.ssafy.house.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.house.model.NoticeBoardDto;
import com.ssafy.house.model.service.NoticeBoardService;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	NoticeBoardService noticeBoardService;
	
	@GetMapping
	public List<NoticeBoardDto> noticeList(){
		return noticeBoardService.noticeList();
	}
	
	@GetMapping("/{no}")
	public NoticeBoardDto getNotice(@PathVariable int no) {
		System.out.println("들어오는지 확인");
		return noticeBoardService.getNotice(no);
	}
	
	@PostMapping
	public ResponseEntity<String> writeNotice(@RequestBody NoticeBoardDto noticeBoardDto){
		if(noticeBoardService.writeNotice(noticeBoardDto)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("{no}")
	public ResponseEntity<String> modifyNotice(@RequestBody NoticeBoardDto noticeBoardDto){
		if(noticeBoardService.modifyNotice(noticeBoardDto)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("{no}")
	public ResponseEntity<String> deleteNotice(@PathVariable int no) {
		if(noticeBoardService.deleteNotice(no)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
}

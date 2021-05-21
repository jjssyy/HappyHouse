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

import com.ssafy.house.model.BoardCommentDto;
import com.ssafy.house.model.service.BoardCommentService;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/comments")
public class BoardCommentController {
	
	@Autowired
	BoardCommentService boardCommentService;
	
	@GetMapping("/{post_no}")
	public List<BoardCommentDto> commentList(@PathVariable int post_no){
		return boardCommentService.commentList(post_no);
	}
	
	@PostMapping("{no}")
	public ResponseEntity<String> writeComment(@RequestBody BoardCommentDto boardCommentDto){
		if(boardCommentService.writeComment(boardCommentDto)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("{no}")
	public ResponseEntity<String> modifyComment(@RequestBody BoardCommentDto boardCommentDto){
		if(boardCommentService.modifyComment(boardCommentDto)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("{no}")
	public ResponseEntity<String> deleteComment(@PathVariable int no){
		if(boardCommentService.deleteComment(no)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
	
}

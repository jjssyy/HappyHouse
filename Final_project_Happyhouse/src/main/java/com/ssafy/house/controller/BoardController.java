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

import com.ssafy.house.model.BoardDto;
import com.ssafy.house.model.service.BoardService;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@GetMapping
	public List<BoardDto> postList(){
		return boardService.postList();
	}
	
	@GetMapping("/{no}")
	public BoardDto getPost(@PathVariable int no) {
		return boardService.getPost(no);
	}
	
	@PostMapping
	public ResponseEntity<String> writePost(@RequestBody BoardDto boardDto){
		if(boardService.writePost(boardDto)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("{no}")
	public ResponseEntity<String> modifyPost(@RequestBody BoardDto boardDto){
		if(boardService.modifyPost(boardDto)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("{no}")
	public ResponseEntity<String> deletePost(@PathVariable int no){
		if(boardService.deletePost(no)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
}

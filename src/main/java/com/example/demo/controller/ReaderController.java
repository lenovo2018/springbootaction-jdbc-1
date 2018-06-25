package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Reader;
import com.example.demo.service.ReaderService;

@RestController
@RequestMapping("reader")
public class ReaderController {
	
	private final Logger logger = LoggerFactory.getLogger(ReaderController.class);
	
	@Autowired
	private ReaderService readerService;
	
	@GetMapping("addReader")
	public boolean addReader(Reader reader) {
		readerService.addReader(reader);
		return true;
		
	}
	@GetMapping("queryReader")
	public Reader reader(String id) {
		Reader reader = readerService.getOne(id);
		logger.debug("~~~~~~~~vgghh");
		return reader;
		
	}
}

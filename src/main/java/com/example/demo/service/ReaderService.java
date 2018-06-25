package com.example.demo.service;

import com.example.demo.entity.Reader;

public interface ReaderService {
	
	Reader addReader(Reader reader);
	
	Reader getOne(String id);
}

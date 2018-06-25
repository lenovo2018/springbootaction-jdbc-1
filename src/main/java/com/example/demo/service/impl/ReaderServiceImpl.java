package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ReaderRepository;
import com.example.demo.entity.Reader;
import com.example.demo.service.ReaderService;

@Service
public class ReaderServiceImpl implements ReaderService{
	
	@Autowired
	private ReaderRepository readerRepository;
	
	@Override
//	@CachePut(value="readerCache")
	public Reader addReader(Reader reader) {
		return readerRepository.save(reader);
		
	}

	@Override
	@Cacheable(value="readerCache")
	public Reader getOne(String id) {
		return readerRepository.findById(id).get();
	}

}

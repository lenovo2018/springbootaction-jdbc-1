package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.entity.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String>,JpaSpecificationExecutor<Reader> {
	Reader findByFullname(String fullname);
}

package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the reader database table.
 * 
 */
@Entity
@NamedQuery(name="Reader.findAll", query="SELECT r FROM Reader r")
public class Reader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String username;

	private String fullname;

	private String password;

	public Reader() {
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
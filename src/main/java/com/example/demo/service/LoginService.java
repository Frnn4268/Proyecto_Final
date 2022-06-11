package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Login.IniciarSesion;
import com.example.demo.Repository.LoginRepository;
@Service
public class LoginService {

	@Autowired
	private LoginRepository repo;
	
	
	public IniciarSesion login(String username, String password) {
		IniciarSesion user = repo.findByUsernameAndPassword(username, password);
	  	return user;
	  }
}

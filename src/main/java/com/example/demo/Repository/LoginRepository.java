package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Login.IniciarSesion;



public interface LoginRepository  extends JpaRepository <IniciarSesion, Long>{
	IniciarSesion findByUsernameAndPassword(String username, String password);
}

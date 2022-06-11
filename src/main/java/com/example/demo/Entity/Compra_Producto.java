package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Compra_Producto {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	private String nombre;
    private String apellido;
    private String NIT;
    private String ciudad;
	
    
    public Compra_Producto() {
		
	}


	public Compra_Producto(Long id, String nombre, String apellido, String nIT, String ciudad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		NIT = nIT;
		this.ciudad = ciudad;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNIT() {
		return NIT;
	}


	public void setNIT(String nIT) {
		NIT = nIT;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
    
    
    
    
    
}

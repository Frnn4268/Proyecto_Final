package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Producto {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	private Long codProduct;
    private String productName;
    private Long cantproduct;
    private int precio;
    
    public Producto() {

	}

	public Producto(Long id, Long codProduct, String productName, Long cantproduct, int precio) {
		super();
		this.id = id;
		this.codProduct = codProduct;
		this.productName = productName;
		this.cantproduct = cantproduct;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodProduct() {
		return codProduct;
	}

	public void setCodProduct(Long codProduct) {
		this.codProduct = codProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getCantproduct() {
		return cantproduct;
	}

	public void setCantproduct(Long cantproduct) {
		this.cantproduct = cantproduct;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Compra_Producto;
import com.example.demo.Entity.Producto;
import com.example.demo.Repository.CompraProductoRepository;
import com.example.demo.Repository.ProductoRepository;

@Service
public class productoCompraService {
	@Autowired
    private CompraProductoRepository compra;
	
	public List<Compra_Producto> listAll() {
        return compra.findAll();
    }
     
    public void save(Compra_Producto std) {
        compra.save(std);
    }
     
    public Compra_Producto get(long id) {
        return compra.findById(id).get();
    }
     
    public void delete(long id) {
        compra.deleteById(id);
    }
}

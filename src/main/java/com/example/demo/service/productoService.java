package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Producto;
import com.example.demo.Repository.ProductoRepository;


@Service
public class productoService {
	@Autowired
    private ProductoRepository repo;
	
	public List<Producto> listAll() {
        return repo.findAll();
    }
     
    public void save(Producto std) {
        repo.save(std);
    }
     
    public Producto get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}

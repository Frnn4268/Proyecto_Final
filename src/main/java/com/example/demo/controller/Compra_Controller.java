package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Entity.Compra_Producto;
import com.example.demo.service.productoCompraService;

@Controller
public class Compra_Controller {
	@Autowired
    private productoCompraService service;

	
	@RequestMapping(value = "/saveCompra", method = RequestMethod.POST)
    public String saveCompra(@ModelAttribute("Producto") Compra_Producto std) {
        service.save(std);
        return "redirect:/inventary";
    }
    
}

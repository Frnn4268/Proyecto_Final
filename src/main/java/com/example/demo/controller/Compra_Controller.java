package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Compra_Producto;
import com.example.demo.Entity.Producto;
import com.example.demo.service.productoCompraService;
import com.example.demo.service.productoService;
@Controller
public class Compra_Controller {
	@Autowired
    private productoCompraService service;

	
	@RequestMapping(value = "/saveCompra", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("Producto") Compra_Producto std) {
        service.save(std);
        return "redirect:/inventary";
    }
	
	
	

    
    
    
    
}

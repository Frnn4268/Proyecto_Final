package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Compra_Producto;
import com.example.demo.service.productoCompraService;


public class Compra_Controller {
	@Autowired
    private productoCompraService service;
	
	@GetMapping("/home")
    public String viewHome(Model model) {	
	        
        return "home";
    }

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("Compra_Producto", new Compra_Producto());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("Compra_Producto") Compra_Producto std) {
        service.save(std);
        return "redirect:/inventary";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Compra_Producto std = service.get(id);
        mav.addObject("Producto", std);
        return mav;
        
    }	
    
    @RequestMapping("/delete/{id}")
    public String deletestudent(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/inventary";
    }
    
    
    
    
}

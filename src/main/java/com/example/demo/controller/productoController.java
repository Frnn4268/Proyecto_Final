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

import com.example.demo.Entity.Producto;
import com.example.demo.service.productoService;

@Controller
public class productoController {
	@Autowired
    private productoService service;
	
	@GetMapping("/home")
    public String viewHome(Model model) {	
	        
        return "home";
    }
	
	@GetMapping("/compras")
    public String viewShop(Model model) {	
	        
        return "Compras";
    }

    @GetMapping("/inventary")
    public String viewHomePage(Model model) {
        List<Producto> liststudent = service.listAll();
        model.addAttribute("liststudent", liststudent);
        System.out.print("Get / ");	
        return "index";
    }	

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("Producto", new Producto());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("Producto") Producto std) {
        service.save(std);
        return "redirect:/inventary";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Producto std = service.get(id);
        mav.addObject("Producto", std);
        return mav;
        
    }
    
    @RequestMapping("/delete/{id}")
    public String deletestudent(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/inventary";
    }
}

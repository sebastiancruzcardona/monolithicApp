package com.eam.monolitichApp.controller;

import com.eam.monolitichApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public String listProducts(Model model) {
        model.addAttribute("products", productService.listAllProducts());
        return "product/list";
    }
}

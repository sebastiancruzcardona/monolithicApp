package com.eam.monolitichApp.controller;

import com.eam.monolitichApp.model.Product;
import com.eam.monolitichApp.model.User;
import com.eam.monolitichApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public String listProducts(Model model) {
        model.addAttribute("products", productService.listAllProducts());
        return "products/list";
    }

    @GetMapping("/new")
    public String showNewProductForm(Model model){ //
        model.addAttribute("product", new Product());
        return "products/form";
    }

    @PostMapping
    public String saveProduct(Product product, Model model){
        productService.saveProduct(product);
        return "redirect:/products/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id, Model model) {
        productService.deleteProduct(id);
        return "redirect:/products/list";
    }
}

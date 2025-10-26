package com.example.postal_search.controller;

import org.springframework.ui.Model;

import com.example.postal_search.model.PostalResponse;
import com.example.postal_search.service.PostalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class PostalController {

    @Autowired
    private PostalService postalService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/search")
    public String search(@RequestParam("zipcode") String zipcode, Model model) {
        PostalResponse response = postalService.requestApi(zipcode);
        model.addAttribute("response", response);
        return "result";
    }
    

}

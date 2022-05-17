package com.codeup.springblog.controllers;

import com.codeup.springblog.respositories.AdRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class AdController {
    private final AdRepository adDao;
    public AdController(AdRepository adDao){
        this.adDao = adDao; // dependency injection ... how the controller talks to the data access layer
    }

    @GetMapping
    public String allAds(Model model){
        model.addAttribute("ads", adDao.findAll());
        return "ads/index";
    }

    @GetMapping("/search")
    public String adSearch(){
        return "ads/search";
    }

    @PostMapping("/search")
    public String searchResults(@RequestParam(name = "title") String title, Model model){
        model.addAttribute("results", adDao.findByTitle(title));
        return "ads/search";
    }

}

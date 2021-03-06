package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Coffee;
import com.codeup.springblog.respositories.CoffeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/coffees")
public class CoffeeController {

    private final CoffeeRepository coffeeDao;

    public CoffeeController(CoffeeRepository coffeeDao) {
        this.coffeeDao = coffeeDao;
    }

    //read
    @GetMapping
    public String allCoffees(Model model) {
        List<Coffee> coffees = coffeeDao.findAll();
        model.addAttribute("coffees", coffees);
        return "coffees/index";
    }

    @GetMapping("/create")
    public String createCoffee(Model model){
        model.addAttribute("coffee", new Coffee());
        return "coffees/create";
    }
    @PostMapping("/create")
    public String doCreateCoffee(@ModelAttribute Coffee coffee){
        coffeeDao.save(coffee);
        return "redirect:/coffees";
    }

    //update
    @GetMapping("/update/{id}")
    public String updateCoffee(@PathVariable long id, Model model){
        model.addAttribute("coffee", coffeeDao.getById(id));
        return "coffees/edit";
    }
    @PostMapping("/update/{id}")
    public String doUpdateCoffee(@ModelAttribute Coffee coffee){
        coffeeDao.save(coffee);
        return "redirect:/coffees";

    }

    //delete
    @PostMapping("/delete")
    public String deleteCoffee(@RequestParam(name = "id") long id){
        coffeeDao.deleteById(id);
        return "redirect:/coffees";
    }


//    @PostMapping
//    public String newsLetterSignup(@RequestParam(name = "email") String email, Model model) {
//        model.addAttribute("email", email);
//        return "view/coffee";
//    }

//    @GetMapping("/{roast}")
//    public String coffeeInfo(@PathVariable String roast, Model model) {
//        Coffee selection = new Coffee(roast, "Cool Beans");
//        Coffee selection2 = new Coffee(roast, "Jolting Joe");
//        if (roast.equals("dark")) {
//            selection.setOrigin("Colombia");
//            selection2.setOrigin("Brazil");
//        } else if (roast.equals("medium")) {
//            selection.setOrigin("New Guinea");
//            selection2.setOrigin("Sumatra");
//        } else {
//            selection.setOrigin("Kenya");
//            selection2.setOrigin("Ethiopia");
//        }
//        List<Coffee> selections = new ArrayList<>();
//        selections.add(selection);
//        selections.add(selection2);
//        model.addAttribute("roast", roast);
//        model.addAttribute("selections", selections);
//        return "view/coffee";
//    }

    ///////////////////////
//    @GetMapping("/{id}")
//    public String editCoffee(){
//        return "view/coffee";
//    }
    ///////////////////////
//    @GetMapping("/new")
//    public String addCoffeeForm() {
//        return "coffees/create";
//    }
//
//    @PostMapping("/new")
//    public String addCoffee(@RequestParam(name = "brand") String brand, @RequestParam(name = "roast") String roast, @RequestParam(name = "origin") String origin) {
//        Coffee coffee = new Coffee(roast, origin, brand);
//        coffeeDao.save(coffee);
//        return "redirect:/coffee";
//    }
}
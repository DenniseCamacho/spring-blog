package com.codeup.springblog.controllers;


import com.codeup.springblog.models.Dice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roll-dice")
public class RollDiceController {
    @GetMapping
    public String showWebSite(){
        return "view/roll-dice";
    }
}
//public class RollDiceController {
//    @GetMapping("/{n}")
//    public double number(@PathVariable double n) {
//        Dice number = new Dice();
//        number.setNumber(n);
//        double randomNum = number.setNumber(Math.random());
//        return n;
//    }
//    public String showDice(){
//        return"roll-dice.html";
//        }
//}

//        if(){number.setNumber();}
//        if(n == 2){number.setNumber();}
//        if(n == 3){number.setNumber();}
//        if(n == 4){number.setNumber();}
//        if(n == 5){number.setNumber();}
//        if(n == 6){number.setNumber();}

//
//    Create a page at /roll-dice[x]
//    that asks the user to guess a number[x].
//    There should be links on this page for 1 through 6 [x]
//    that should make a GET request to /roll-dice/n
//    where n is the number guessed.
//
//    This page should display a random number (the dice roll), the user's guess and a message based on whether or not they guessed the correct number.
//
//    Bonus
//
//"Roll" a series of dice on each page load, as opposed to an individual die. Show all the rolls to the user and display how many rolls matched their guess.

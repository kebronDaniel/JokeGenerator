package com.example.jokeGenerator.JokeGenerator.controller;

import com.example.jokeGenerator.JokeGenerator.service.JokeGeneratorService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeGeneratorController {

    private final JokeGeneratorService jokeGeneratorService;

    public JokeGeneratorController(JokeGeneratorService jokeGeneratorService) {
        this.jokeGeneratorService = jokeGeneratorService;
    }

    @RequestMapping({"/", ""})
    public String generateRandomJokes(Model model){
        model.addAttribute("joke", jokeGeneratorService.generateJoke());
        return "index";
    }
}

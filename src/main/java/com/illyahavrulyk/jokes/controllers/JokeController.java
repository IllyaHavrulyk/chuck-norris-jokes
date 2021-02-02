package com.illyahavrulyk.jokes.controllers;

import com.illyahavrulyk.jokes.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }

}

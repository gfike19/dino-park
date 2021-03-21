package com.gfike.dinopark.controllers;

import com.gfike.dinopark.daos.DinoDao;
import com.gfike.dinopark.models.Dino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    DinoDao dinoDao;

    @GetMapping
    public String index(Model model) {
//        List<Dino> allDinos = (List<Dino>)dinoDao.findAll();
        String title = "Dino Park Helper";
        model.addAttribute("allDinos", dinoDao.findAll());
        model.addAttribute("title", title);
        return "index";
    }

    @GetMapping(path="error")
    public String Error () {
        return "error";
    }
}

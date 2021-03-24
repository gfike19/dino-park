package com.gfike.dinopark.controllers;

import com.gfike.dinopark.daos.DinoDao;
import com.gfike.dinopark.models.Dino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    DinoDao dinoDao;

    @GetMapping
    public String index(Model model, HttpSession session) {
        if(session.getAttribute("dinoSelected") == null) {
            session.setAttribute("dinoSelected", false);
        }
        boolean dinoSelected = (boolean) session.getAttribute("dinoSelected");

        if((boolean)session.getAttribute("dinoSelected") == true) {
            Dino currDino = (Dino) session.getAttribute("currDino");
            model.addAttribute("currDino", currDino);
        }
        model.addAttribute("dinoSelected", dinoSelected);
        model.addAttribute("allDinos", dinoDao.findAll());
        model.addAttribute("title", "Jurassic World Evolution Assistant");
        return "index";
    }

    @PostMapping
    public String index(ServletRequest request, HttpSession session, Model model) {
        int id = Integer.parseInt(request.getParameter("allDinos"));
        Dino currDino = null;
        for(Dino d : dinoDao.findAll()) {
            if(d.getId() == id) {
                currDino = d;
            }
        }
//        model.addAttribute("currDino", currDino);
        session.setAttribute("currDino", currDino);
        session.setAttribute("dinoSelected", true);
        return "redirect:/";
    }

    @GetMapping(path="error")
    public String Error () {
        return "error";
    }
}

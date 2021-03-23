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
        boolean dinoSelected;
        if(session.getAttribute("dinoSelected") == null) {
            dinoSelected = false;
            session.setAttribute("dinoSelected", dinoSelected);
        } else {
            dinoSelected = (boolean) session.getAttribute("dinoSelected");
        }
        model.addAttribute("dinoSelected", dinoSelected);
        model.addAttribute("allDinos", dinoDao.findAll());
        model.addAttribute("title", "Jurassic World Evolution Helper App");
        return "index";
    }

    @PostMapping
    public String index(Model model, ServletRequest request, HttpSession session) {
        try {
            String id = request.getParameter("allDinos");
            Dino currDino = dinoDao.findById(Integer.parseInt(id));
            model.addAttribute("currDino", currDino);
            boolean dinoSelected;
            session.removeAttribute("dinoSelected");
            dinoSelected = true;
            session.setAttribute("dinoSelected", dinoSelected);
            model.addAttribute("dinoSelected", dinoSelected);
        } catch(Exception e) {
            String msg = e.toString();
            model.addAttribute("msg",  msg);
        }
        return "redirect:/";
    }
    @GetMapping(path="error")
    public String Error () {
        return "error";
    }
}

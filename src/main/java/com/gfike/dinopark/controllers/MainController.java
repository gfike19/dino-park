package com.gfike.dinopark.controllers;

import com.gfike.dinopark.data.DinoDao;
import com.gfike.dinopark.data.DinoRepository;
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

    @Autowired
    private DinoRepository dinoRepo;

    @GetMapping
    public String index(Model model, HttpSession session) {
        if(session.getAttribute("dinoSelected") == null) {
            session.setAttribute("dinoSelected", false);
        }
        boolean dinoSelected = (boolean) session.getAttribute("dinoSelected");

        if((boolean)session.getAttribute("dinoSelected") == true) {
            Dino currDino = (Dino) session.getAttribute("currDino");
            model.addAttribute("currDino", currDino);
            List<Dino> safeByType = (List<Dino>) session.getAttribute("safeByType");
            model.addAttribute("safeByType", safeByType);
        }

        String userMsg = "";
        if(session.getAttribute("userMsg") != null) {
            userMsg = session.getAttribute("userMsg").toString();
            model.addAttribute("userMsg", userMsg);
            session.removeAttribute("userMsg");
        }
        model.addAttribute("dinoSelected", dinoSelected);
        model.addAttribute("allDinos", dinoDao.findAll());
        model.addAttribute("title", "Jurassic World Evolution Assistant");
        return "index";
    }

    @PostMapping
    public String index(ServletRequest request, HttpSession session) {

        if(request.getParameter("allDinos") == "") {
            session.removeAttribute("dinoSelected");
            session.setAttribute("dinoSelected", false);
            return "redirect:/";
        }

        int id = Integer.parseInt(request.getParameter("allDinos"));
        Dino currDino = dinoDao.findById(id);

        if(currDino.getDinoName().equals("Tyrannosaurus Rex")) {
            String userMsg = "T Rex has to be alone!";
            session.setAttribute("userMsg", userMsg);
            session.setAttribute("currDino", currDino);
            session.setAttribute("dinoSelected", true);
            return "redirect:/";
        }

        String dinoType = currDino.getDinoType();

        List<Dino> safeByType = null;

        if(!currDino.getDinoName().equals("Tyrannosaurus Rex") &&
        dinoType.equals("Large Carnivore") || dinoType.equals("Large Piscivore")) {
            safeByType = dinoRepo.FindLargeCarnivoreSafe();
        }

        if(dinoType.equals("Small Carnivore")) {
            safeByType = dinoRepo.FindSmallCarnivoreSafe();
        }

        if(dinoType.equals("Giant Herbivore")) {
            safeByType = dinoRepo.SansTrex();
        }

        if(dinoType.equals("Armored Herbivore")) {
            safeByType = dinoRepo.FindArmoredHerbivoreSafe();
        }

        if(dinoType.equals("Medium Herbivore") || dinoType.equals("Small Herbivore")) {
            safeByType = dinoRepo.FindSmallMediumHerbivoreSafe();
        }

        for(Dino d : safeByType) {
            if(d.getDinoName().equals(currDino.getDinoName())) {
                safeByType.remove(d);
                break;
            }
        }

        session.setAttribute("safeByType", safeByType);
        session.setAttribute("currDino", currDino);
        session.setAttribute("dinoSelected", true);
        return "redirect:/";
    }

    @GetMapping(path="error")
    public String Error () {
        return "error";
    }

    @GetMapping(path="test")
    public String Test (Model model) {
        List<Dino> test = dinoRepo.FindLargeCarnivoreSafe();
        model.addAttribute("test", test);
        return "test";
    }
}

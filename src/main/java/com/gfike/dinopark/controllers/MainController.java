package com.gfike.dinopark.controllers;

import com.gfike.dinopark.config.DinoTypes;
import com.gfike.dinopark.data.DinoDao;
import com.gfike.dinopark.data.DinoRepository;
import com.gfike.dinopark.models.Dino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    DinoDao dinoDao;

    @Autowired
    private DinoRepository dinoRepo;

    @Autowired
    DinoTypes dinoTypes;

    @GetMapping
    public String index(Model model, HttpSession session) {
        boolean dinoSelected;
        boolean tRexPresent = false;
        String userMsg = "";
        if(session.getAttribute("dinoSelected") == null || session.getAttribute("currDino") == null) {
            session.setAttribute("dinoSelected", false);
            model.addAttribute("allDinos", dinoDao.findAll());
            model.addAttribute("title", "Jurassic World Evolution Assistant");
            return "index";
        } else {
            dinoSelected = (boolean) session.getAttribute("dinoSelected");
        }

        if(dinoSelected) {
            Dino currDino = (Dino) session.getAttribute("currDino");
            if(currDino.getDinoName().equals("Tyrannosaurus Rex")) {
                tRexPresent = true;
            }
            if(tRexPresent){
                model.addAttribute("trexPresent", true);
            }
            if(!tRexPresent) {
                model.addAttribute("currDino", currDino);
                List<Dino> safeByType = (List<Dino>) session.getAttribute("safeByType");
                model.addAttribute("safeByType", safeByType);
            }
        }

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

        if(Objects.equals(request.getParameter("allDinos"), "")) {
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

        String currDinoType = currDino.getDinoType();

        List<Dino> safeByType = null;

        List <String> largeCarnCompatible = Arrays.asList(dinoTypes.getLargeCarnivore(), dinoTypes.getHybridCarnivore(),
                dinoTypes.getVeryLargeCarnivore(), dinoTypes.getMediumSizedCarnivore(),
                dinoTypes.getVeryLargePiscivoreCarnivore(), dinoTypes.getMediumSizedPiscivoreCarnivore());

        if(!currDino.getDinoName().equals("Tyrannosaurus Rex") && largeCarnCompatible.contains(currDinoType)) {
            safeByType = dinoRepo.FindLargeCarnivoreSafe();
        }

        if(currDinoType.equals(dinoTypes.getSmallCarnivore())) {
            safeByType = dinoRepo.FindSmallCarnivoreSafe();
        }

        if(currDinoType.equals(dinoTypes.getVeryLargeHerbivore())) {
            safeByType = dinoRepo.SansTrex();
        }

        if(currDinoType.equals(dinoTypes.getArmoredHerbivore())) {
            safeByType = dinoRepo.FindArmoredHerbivoreSafe();
        }

        if(currDinoType.equals(dinoTypes.getSmallHerbivore()) || currDinoType.equals(dinoTypes.getMediumSizedHerbivore())) {
            safeByType = dinoRepo.FindSmallMediumHerbivoreSafe();
        }

//        for(Dino d : safeByType) {
//            if(d.getDinoName().equals(currDino.getDinoName())) {
//                safeByType.remove(d);
//                break;
//            }
//        }

        session.setAttribute("safeByType", safeByType);
        session.setAttribute("currDino", currDino);
        session.setAttribute("dinoSelected", true);
        return "redirect:/";
    }

    @GetMapping(path="{id}")
    public String safeByType(Model model, @PathVariable int id) {
//        int dinoId = Integer.parseInt(id);
        Dino d = dinoDao.findById(id);
        model.addAttribute("dino", d);
        model.addAttribute("title", d.getDinoName());
        return "displayDino";
    }

    @GetMapping("favicon.ico")
    @ResponseBody
    void handleFavicon() {
        // No-op or provide an icon response if needed
    }
}

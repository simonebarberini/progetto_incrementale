package com.example.progetto_incrementale;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class RicettaController {
    @Autowired
    RicettaRepository ricettaRepository;

    @GetMapping("/")
    public String getRicette(Model model) {
        List<Ricetta> ricetteList = ricettaRepository.findAll();
        model.addAttribute("ricetteList", ricetteList);
        return "ricette";
    }

    @GetMapping("/aggiungiRicetta")
    public String formRicetta(Model model) {
        Ricetta ricetta = new Ricetta();
        model.addAttribute("ricetta",ricetta);
        return "aggiungiRicetta";
    }
    

    @PostMapping("/aggiungiRicetta")
    public String aggiungiRicetta(Ricetta ricetta) {
        ricettaRepository.save(ricetta);
        return "redirect:/";
    }

    // @GetMapping("aggiornaRicetta/{id}")
    // public String formAggiornaRicetta() {
       
        
    //     return entity;
    // }
    
    
}

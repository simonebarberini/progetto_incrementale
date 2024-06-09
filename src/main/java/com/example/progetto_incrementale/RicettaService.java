package com.example.progetto_incrementale;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class RicettaService {
    @Autowired
    RicettaRepository ricettaRepository;

    public Ricetta getRicettaById(Long id){
        Optional<Ricetta> optional = ricettaRepository.findById(id);
        Ricetta ricetta = new Ricetta();
        if(optional.isPresent()){
            ricetta = optional.get();
        }else{
            
        }
    }
}

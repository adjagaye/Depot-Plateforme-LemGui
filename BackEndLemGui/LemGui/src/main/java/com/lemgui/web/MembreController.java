package com.lemgui.web;

import com.lemgui.entities.Membre;
import com.lemgui.service.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class MembreController {
    private final
    MembreRepository membreRepository;

    @Autowired
    public MembreController(MembreRepository membreRepository) {
        this.membreRepository = membreRepository;

    }

    //@RequestMapping(value = "/utilisateurs", method = RequestMethod.GET)
   /* public List<Membre> getMembres() {
        return membreRepository.findAll();
    }*/

}

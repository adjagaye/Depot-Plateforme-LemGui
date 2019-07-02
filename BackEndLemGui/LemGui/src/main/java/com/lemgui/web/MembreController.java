package com.lemgui.web;

import com.lemgui.entities.Membre;
import com.lemgui.entities.TypeMembre;
import com.lemgui.service.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MembreController {
    private final MembreRepository membreRepository;

    @Autowired
    public MembreController(MembreRepository membreRepository) {
        this.membreRepository = membreRepository;

    }

    @RequestMapping(value = "/utilisateurs", method = RequestMethod.GET)
    public List<Membre> getUtilisateurs() {
        return membreRepository.findAll();
    }

    @RequestMapping(value ="/membres/{id}",method = RequestMethod.POST)
    public Membre save(@PathVariable long id, @RequestBody Membre m){
        TypeMembre tp = new TypeMembre();
        tp.setIdTypeMembre(id);
        m.setTypeMembre(tp);
        System.out.println(id);
        System.out.println("tttttttttttttttttteeeeeeeeeeeeeeestt");

        return membreRepository.save(m);
    }
}

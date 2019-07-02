package com.lemgui.web;

import com.lemgui.entities.Donateur;
import com.lemgui.entities.TypeDonateur;
import com.lemgui.service.DonateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class DonateurController {
    private final DonateurRepository donateurRepository;

    @Autowired
    public  DonateurController(DonateurRepository donateurRepository) {
        this.donateurRepository = donateurRepository;

    }

    @RequestMapping(value ="/donateurs/{id}",method = RequestMethod.POST)
    public Donateur save(@PathVariable long id, @RequestBody Donateur d){
        TypeDonateur tp = new TypeDonateur();
        tp.setIdTypeDonateur(id);
        d.setTypeDonateur(tp);
        System.out.println(id);
        System.out.println("tttttttttttttttttteeeeeeeeeeeeeeestt");

        return donateurRepository.save(d);
    }
}

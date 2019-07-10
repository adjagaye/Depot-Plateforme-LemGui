package com.lemgui.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lemgui.entities.Cadre;
import com.lemgui.entities.Domaine;
import com.lemgui.service.DomaineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class DomaineController {
    private  final DomaineRepository domaineRepository;

    @Autowired
    public DomaineController(DomaineRepository domaineRepository) {
        this.domaineRepository = domaineRepository;
    }

    @PostMapping("/saveDomaines/")
    public Domaine getImages(@RequestParam("file") MultipartFile file, @RequestParam("cadre") String c)
    {
        Domaine domaine = new Domaine();
        System.out.println("adja gaye");
        System.out.println(file.getOriginalFilename());
        System.out.println(c);

        try
        {
            ObjectMapper mapper = new ObjectMapper();
            domaine = mapper.readValue(c, Domaine.class);


        }
        catch(Exception ex)
        {
            System.out.println("Error while converting JSON string to Student object.");
            ex.printStackTrace();
        }

        return domaineRepository.save(domaine);

    }
}

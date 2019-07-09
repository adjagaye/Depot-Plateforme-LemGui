package com.lemgui.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lemgui.entities.Cadre;
import com.lemgui.service.CadreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class CadreController {
    private final CadreRepository cadreRepository;

    @Autowired
    public CadreController(CadreRepository cadreRepository){
        this.cadreRepository = cadreRepository;

    }

    /*@RequestMapping(value = "/images", method = RequestMethod.POST)
    public void getImages( @RequestParam("image") MultipartFile file) {
        System.out.println("TestImage");
        System.out.println(file.getOriginalFilename());

    }*/

    @PostMapping("/images/")
    public Cadre getImages(@RequestParam("file") MultipartFile file,@RequestParam("cadre") String c)
    {
        Cadre cadre = new Cadre();
        System.out.println("adja gaye");
        System.out.println(file.getOriginalFilename());
        System.out.println(c);

        try
        {
            ObjectMapper mapper = new ObjectMapper();
            cadre = mapper.readValue(c, Cadre.class);


        }
        catch(Exception ex)
        {
            System.out.println("Error while converting JSON string to Student object.");
            ex.printStackTrace();
        }

        return cadreRepository.save(cadre);

    }
}

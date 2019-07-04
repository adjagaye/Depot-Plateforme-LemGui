package com.lemgui.web;

import com.lemgui.entities.Cadre;
import com.lemgui.entities.Membre;
import com.lemgui.service.CadreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

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

    @PostMapping("/images")
    public String getImages(@RequestParam("file") MultipartFile file)
    {
        System.out.println("adja gaye");
        String message;
        message="Work";
        return message;

    }
}

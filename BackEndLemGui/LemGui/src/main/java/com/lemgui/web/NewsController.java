package com.lemgui.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lemgui.entities.News;
import com.lemgui.service.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class NewsController {

    private final NewsRepository newsRepository;

    @Autowired
    public NewsController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @PostMapping("/images/")
    public News getImages(@RequestParam("file") MultipartFile file, @RequestParam("cadre") String c)
    {
        News news = new News();
        System.out.println("adja gaye");
        System.out.println(file.getOriginalFilename());
        System.out.println(c);

        try
        {
            ObjectMapper mapper = new ObjectMapper();
            news = mapper.readValue(c, News.class);


 

        }
        catch(Exception ex)
        {
            System.out.println("Error while converting JSON string to Student object.");
            ex.printStackTrace();
        }

        return newsRepository.save(news);

    }
}

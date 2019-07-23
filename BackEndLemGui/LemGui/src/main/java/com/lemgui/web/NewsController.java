package com.lemgui.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lemgui.entities.Membre;
import com.lemgui.entities.News;
import com.lemgui.entities.TypeNews;
import com.lemgui.service.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class NewsController {

    private final NewsRepository newsRepository;

    @Autowired
    public NewsController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @RequestMapping(value = "/nouvelles", method = RequestMethod.GET)
    public List<News> getNews() {
        return newsRepository.findAll();
    }

    @PostMapping("/saveNews/")
    public News getImages(@RequestParam("file") MultipartFile file, @RequestParam("cadre") String c)
    {
        News news = new News();
        Object o ;
        System.out.println("adja gaye");
        System.out.println(file.getOriginalFilename());
        System.out.println(c);
        Map<String,String> myMap = new HashMap<String, String>();

        ObjectMapper objectMapper = new ObjectMapper();
        try {

            myMap = objectMapper.readValue(c, HashMap.class);
            System.out.println("Map is: "+myMap);
            for (Map.Entry<String, String> entry : myMap.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
                if(entry.getKey().equalsIgnoreCase("auteur")){
                    news.setAuteur(entry.getValue());
                }
                if(entry.getKey().equalsIgnoreCase("descriptionNews")){
                    news.setDescriptionNews(entry.getValue());
                }
                if(entry.getKey().equalsIgnoreCase("imageNews")){
                    news.setImageNews(entry.getValue());
                }
                if(entry.getKey().equalsIgnoreCase("typeNews")){
                    TypeNews tn = new TypeNews();
                    tn.setIdTypeNews(Long.parseLong(entry.getValue()));
                    news.setTypeNews(tn);
                }

            }
            System.out.println("****"+news.getAuteur());
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* try
        {
            ObjectMapper mapper = new ObjectMapper();
            news = mapper.readValue(c, News.class);

        }
        catch(Exception ex)
        {
            System.out.println("Error while converting JSON string to Student object.");
            ex.printStackTrace();
        }*/

        return newsRepository.save(news);

    }
}

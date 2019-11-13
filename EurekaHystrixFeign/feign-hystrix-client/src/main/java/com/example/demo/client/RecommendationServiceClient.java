package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Product;

@FeignClient("recommendation-service")
public interface RecommendationServiceClient {

    @RequestMapping(value = "/recommendation", method = RequestMethod.GET)
    public List<Product> getRecommendations();
    
    @RequestMapping(value="/saveRecommendation",method=RequestMethod.POST)
    public void saveProduct( Product product);
}

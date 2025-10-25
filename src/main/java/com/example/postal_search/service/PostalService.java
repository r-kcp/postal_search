package com.example.postal_search.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostalService {
    public String requestApi(String zipcode){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://zipcloud.ibsnet.co.jp/api/search?zipcode=" + zipcode;
        return restTemplate.getForObject(url, String.class);
    }
    
}

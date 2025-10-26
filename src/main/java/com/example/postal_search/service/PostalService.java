package com.example.postal_search.service;

import org.springframework.stereotype.Service;
import com.example.postal_search.model.PostalResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.client.RestTemplate;


@Service
public class PostalService {

    public PostalResponse requestApi(String zipcode){
            RestTemplate restTemplate = new RestTemplate();

        String url = "https://zipcloud.ibsnet.co.jp/api/search?zipcode=" + zipcode;

         // ①まず String で受ける（text/plain対応）
        String responseJson = restTemplate.getForObject(url, String.class);
        
         // ②Jackson で PostalResponse に変換
        ObjectMapper mapper = new ObjectMapper();
        PostalResponse response = null;

        try {
            response = mapper.readValue(responseJson, PostalResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return response;   // 中身を返す
    }    
}

package com.example.postal_search.model;
import java.util.List;


public class PostalResponse {
    private String message;
    private List<PostalResult> results;
    private int status;

    public String getMessage(){
        return message;
    }    

    public void setMessage(String message){
        this.message = message;
    }

    public List<PostalResult> getResults(){
        return results;
    }

    public void setResults(List<PostalResult> results){
        this.results = results;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }

}

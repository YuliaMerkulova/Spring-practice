package com.example.server.controller;

import com.example.server.dto.Cat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CatsController {
    @GetMapping(path = "/cats", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String cats() {
        return "Возвращаю всех кошек!";
    }

    @PostMapping(path = "/cat", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public String addCat(@RequestBody Cat cat){
        return "Добавляю кошку!";
    }

    @GetMapping(path = "/cat/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getCat(@PathVariable int id){
        return "Возвращаю кошку!";
    }

    @GetMapping(path = "/colorFilter", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getColoredCats(@RequestParam String color){
        return "Возвращаю кошку конкретного цвета!";
    }

    @DeleteMapping(path ="/deleteCat", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cat deleteCat(@RequestBody Cat cat){
        return cat;
    }

    @PatchMapping(path = "/updateCatSetting", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateCatSetting(@RequestBody Cat cat){
        return "<UNK> <UNK>!";
    }

}

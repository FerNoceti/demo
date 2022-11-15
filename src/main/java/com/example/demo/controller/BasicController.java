package com.example.demo.controller;

import com.example.demo.service.SortedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BasicController {
    @Autowired
    SortedList sortedList;

    @GetMapping("/hello")
    String hola(){
        return "Hello World";
    }

    @PostMapping("/hello")
    String nombre(String name){
        return "Hello " + name;
    }

    @PostMapping(value = "/array")
    public List<Integer> postArray(@RequestParam List<Integer> list) {
        return sortedList.sortList(list);
    }
}


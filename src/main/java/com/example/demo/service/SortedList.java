package com.example.demo.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SortedList {
    public List<Integer> sortList(List<Integer> list){
        return list.stream().sorted().collect(Collectors.toList());
    }

}

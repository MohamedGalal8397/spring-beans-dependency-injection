package com.Mohamed.BeansProject.services.impl;

import com.Mohamed.BeansProject.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {


    @Override
    public String print() {
        return "blue";
    }
}

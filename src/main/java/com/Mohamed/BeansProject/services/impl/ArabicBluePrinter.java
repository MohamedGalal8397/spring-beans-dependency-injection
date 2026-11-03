package com.Mohamed.BeansProject.services.impl;

import com.Mohamed.BeansProject.services.BluePrinter;
import org.springframework.stereotype.Component;



public class ArabicBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "ازرق";
    }
}

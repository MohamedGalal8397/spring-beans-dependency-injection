package com.Mohamed.BeansProject.services.impl;

import com.Mohamed.BeansProject.services.RedPrinter;
import org.springframework.stereotype.Component;


@Component
public class ArabicRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "احمر";
    }
}

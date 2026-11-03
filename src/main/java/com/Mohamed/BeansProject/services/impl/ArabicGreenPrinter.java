package com.Mohamed.BeansProject.services.impl;

import com.Mohamed.BeansProject.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class ArabicGreenPrinter implements GreenPrinter
{
    @Override
    public String print() {
        return "اخضر";
    }
}

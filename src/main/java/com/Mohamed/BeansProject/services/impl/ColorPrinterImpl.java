package com.Mohamed.BeansProject.services.impl;

import com.Mohamed.BeansProject.services.BluePrinter;
import com.Mohamed.BeansProject.services.ColorPrinter;
import com.Mohamed.BeansProject.services.GreenPrinter;
import com.Mohamed.BeansProject.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImpl implements ColorPrinter {


    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinterl ;


    public ColorPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter , BluePrinter bluePrinter) {

        // before beans
            // this.redPrinter = new EnglishRedPrinter();
            //this.greenPrinter = new EnglishGreenPrinter();
            //this.bluePrinterl = new EnglishBluePrinter();
        // after beans
             this.redPrinter = redPrinter ;
            this.greenPrinter = greenPrinter;
            this.bluePrinterl = bluePrinter;
    }

    @Override
    public String print() {
        return redPrinter.print() + "," + bluePrinterl.print() +","+greenPrinter.print();
    }
}

//package com.Mohamed.BeansProject.configuration;
//
//
//import com.Mohamed.BeansProject.services.BluePrinter;
//import com.Mohamed.BeansProject.services.ColorPrinter;
//import com.Mohamed.BeansProject.services.GreenPrinter;
//import com.Mohamed.BeansProject.services.RedPrinter;
//import com.Mohamed.BeansProject.services.impl.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//

// //deceleration beans by configuration way


//@Configuration
//public class PrinterConfig {
//
//
//    @Bean
//    public RedPrinter redPrinter(){
//         // return  new EnglishRedPrinter();
//        return  new ArabicRedPrinter();
//    }
//
//    @Bean
//    public GreenPrinter greenPrinter(){
//       // return  new EnglishGreenPrinter();
//        return new ArabicGreenPrinter();
//    }
//    @Bean
//    public BluePrinter bluePrinter(){
//      //  return  new EnglishBluePrinter();
//        return  new ArabicBluePrinter();
//    }
//
//    @Bean
//    public ColorPrinter colorPrinter(RedPrinter redPrinter , BluePrinter bluePrinter , GreenPrinter greenPrinter){
//        return new ColorPrinterImpl(redPrinter , greenPrinter , bluePrinter);
//    }
//
//}

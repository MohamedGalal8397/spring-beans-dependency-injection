package com.Mohamed.BeansProject;

import com.Mohamed.BeansProject.services.BluePrinter;
import com.Mohamed.BeansProject.services.ColorPrinter;
import com.Mohamed.BeansProject.services.GreenPrinter;
import com.Mohamed.BeansProject.services.RedPrinter;
import com.Mohamed.BeansProject.services.impl.ColorPrinterImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class BeansProjectApplication implements CommandLineRunner {

	// after Beans
			private ColorPrinter colorPrinter ;

			// constructor injection way
			public BeansProjectApplication(ColorPrinter colorPrinter) {
				this.colorPrinter = colorPrinter;
			}

	public static void main(String[] args) {
		SpringApplication.run(BeansProjectApplication.class, args);
	}


	// before beans
	   	//final ColorPrinter colorPrinter = new ColorPrinterImpl();




	@Override
	public void run(String... args) throws Exception {
		log.info(colorPrinter.print());
}
}

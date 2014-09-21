package com.devbay;

import com.devbay.spring.Printer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainInt {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainInt.class);
        Printer printer = context.getBean(Printer.class);
        printer.printMessage();
    }
}

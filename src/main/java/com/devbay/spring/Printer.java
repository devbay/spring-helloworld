package com.devbay.spring;

import com.devbay.spring.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Printer {

    @Autowired
    IMessageService messageService;

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }

}

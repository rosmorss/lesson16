package com.impact.lessons.services;

import com.impact.lessons.constants.AppConstants;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHallo(){
        return AppConstants.HELLO_WORLD;
    }
}
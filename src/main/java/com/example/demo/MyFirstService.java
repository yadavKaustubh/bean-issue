package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService
{
    @Autowired
    public MyFirstClass myFirstClass;

    public MyFirstService( MyFirstClass myFirstClass)
    {
        this.myFirstClass = myFirstClass;
        System.out.println("Service created with myVar = "+ myFirstClass.myVar);
    }
}

package com.example.DemoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    @Autowired // Field Injection
    Laptop laptop;

    // constructor Injection no need for @Autowired
    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        laptop.compile();
        System.out.println("I am building a cool project :-)");
    }
}

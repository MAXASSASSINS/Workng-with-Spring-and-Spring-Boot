package com.example.DemoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // Field Injection
    Computer computer;

//    // constructor Injection no need for @Autowired
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }


//    @Autowired // Setter Injection
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){
        computer.compile();
        System.out.println("I am building a cool project :-)");
    }
}

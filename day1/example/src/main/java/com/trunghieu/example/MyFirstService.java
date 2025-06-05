package com.trunghieu.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
//    Case1:
//    @Autowired
//    private MyFirstClass myFirstClass;

//    Case2:
    private MyFirstClass myFirstClass;

//    @Autowired
//    public MyFirstService(@Qualifier("second_bean") MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }

//    Case3:
    @Autowired
    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory() {
        return "The dependency is saying : " + myFirstClass.sayHello();
    }
}

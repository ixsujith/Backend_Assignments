package com.example.Task5.WithoutSpring;

public class Class1 {
    Class2 class2 = new Class2();

    public void TightCoupling1() {
        class2.TightCoupling2(": Sending from class 1 to main");
    }
}

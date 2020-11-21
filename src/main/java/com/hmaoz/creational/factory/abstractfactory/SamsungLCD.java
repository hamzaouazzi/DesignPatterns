package com.hmaoz.creational.factory.abstractfactory;


public class SamsungLCD implements ISamsung{
    @Override
    public void powerOn() {
        System.out.println("Samsung, Imagine");
    }
}

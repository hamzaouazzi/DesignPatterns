package com.hmaoz.creational.factory.abstractfactory;

public class SonyLED implements ISony{
    @Override
    public void powerOn() {
        System.out.println("Sony, make.believe");
    }
}

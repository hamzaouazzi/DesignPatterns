package com.hmaoz.structural.adapter.classadapter;

public class Plug implements IPlug {
    @Override
    public Volt getVolt() {
        return new Volt(240);
    }
}

package com.hmaoz.structural.adapter.objectadapter;

import com.hmaoz.structural.adapter.classadapter.IPlug;
import com.hmaoz.structural.adapter.classadapter.Volt;

public class Plug implements IPlug {
    @Override
    public com.hmaoz.structural.adapter.classadapter.Volt getVolt() {
        return new Volt(240);
    }
}

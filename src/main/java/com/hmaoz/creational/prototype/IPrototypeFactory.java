package com.hmaoz.creational.prototype;

public interface IPrototypeFactory {
    PrototypeCapable getShape(String shapeType) throws CloneNotSupportedException;
    void register(String type, PrototypeCapable prototype);
}

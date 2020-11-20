package com.hmaoz.behavioral.visitor;

public interface Visitable {
    void accept(Visitor visitor);
}

package com.hmaoz.structural.bridge;

public class Circle extends Shape {
    private final int x,y,radius;

    public Circle(int x,int y,int radius,CircleRenderer renderer) {
        super(renderer);
        this.x=x;
        this.y=y;
        this.radius= radius;
    }


    @Override
    public String draw() {
        return renderer.drawCircle(x,y,radius);
    }
}

package com.devmaster.lesson02.dependency_injection;

public interface Shape {
    void draw();
}

class CircleShape implements Shape{
    @Override
    public void draw() {
        System.out.println("CircleShape draw");
    }
}

class RectangleShape implements Shape{
    @Override
    public void draw() {
        System.out.println("RectangleShape draw");
    }
}



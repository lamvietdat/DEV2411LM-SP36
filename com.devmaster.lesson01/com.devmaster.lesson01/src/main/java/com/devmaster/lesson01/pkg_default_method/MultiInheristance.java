package com.devmaster.lesson01.pkg_default_method;

public class MultiInheristance implements Shape,Interdace1,Interface2{
    @Override
    public void draw(){
        System.out.println("MultiInheristance");
    }

    @Override
    public void setColor(String color) {
        Shape.super.setColor(color);
        System.out.println("MultiInheristance setCoolor");
    }

    @Override
    public void method1() {
        Interdace1.super.method1();
        System.out.println("MultiInheristance method1");
    }

    //test
    public static void main(String[] args) {
        MultiInheristance m1=new MultiInheristance();
        m1.method1();
        m1.setColor("red");
        m1.method2();
        m1.setColor("blue");
    }
}

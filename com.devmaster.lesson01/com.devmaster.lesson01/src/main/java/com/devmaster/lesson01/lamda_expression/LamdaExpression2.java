package com.devmaster.lesson01.lamda_expression;

public class LamdaExpression2 {
    public static void main(String[] args) {
        //lamda su dung 1 tham so
        SayHello2 say1=(name)->{ //co 1 tham so duy nhat trong ()
            System.out.println("Hello "+name);
        };
        say1.sayHello("Devmaster");

        // ngan gon
        SayHello2 say2=name -> {
            System.out.println("Hello "+name);
        };
        say2.sayHello("Devmaster");

        //ngan gon hon
        SayHello2 say3=name-> System.out.println("Hello "+name);
        say3.sayHello("Devmaster");
    }
}

package com.devmaster.lesson01.lamda_expression;

public class LamdaExpression1 {
    public static void main(String[] args) {
        SayHello1 sayHello1 =()->{ //khong co tham sau trong ()
            System.out.println("Hello World");
        };
        sayHello1.sayHello();
    }
}

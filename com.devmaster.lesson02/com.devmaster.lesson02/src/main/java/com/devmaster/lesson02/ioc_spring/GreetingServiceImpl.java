package com.devmaster.lesson02.ioc_spring;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String greet(String name) {
        return "<h2>Xin chào</h2>"+"<h1 style='color:red;text-align:center'>"+name;
    }
}

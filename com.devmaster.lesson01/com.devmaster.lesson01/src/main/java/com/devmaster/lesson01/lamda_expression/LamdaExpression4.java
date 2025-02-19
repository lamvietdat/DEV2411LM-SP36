//lamda voi vong lap
package com.devmaster.lesson01.lamda_expression;

import java.util.Arrays;
import java.util.List;

public class LamdaExpression4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java SpringBoot", "C#", "NetCore", "PHP", "JavaScript");
        list.forEach(item -> System.out.println(item));
        System.out.println("============");
        list.forEach(System.out::println);
        System.out.println("============");
        //filter
        list.stream().filter(item -> item.length() > 10).forEach(System.out::println);
        System.out.println("============");
        list.stream().filter(item -> item.contains("c")).forEach(System.out::println);
    }
}

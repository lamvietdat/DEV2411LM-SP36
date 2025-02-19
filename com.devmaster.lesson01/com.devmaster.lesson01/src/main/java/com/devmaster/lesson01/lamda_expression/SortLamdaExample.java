package com.devmaster.lesson01.lamda_expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLamdaExample {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Java SpringBoot","C#","NetCore","PHP","JavaScript");
        //sap xep, su dung bieu thuc lamda
        Collections.sort(list,(String str1, String str2)->str1.compareTo(str2));
        for(String str:list){
            System.out.println(str);
        }
    }
}

package com.devmaster.lesson01.method_ref;

import java.util.Arrays;

public class DemoMethodRef {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int sum = doAction(a,b,MathUtils::sum);
        System.out.println(a+ "+" +b+ "=" +sum);
        //tham chieu den mot instance method cua mot doi tuong cu the

        MathUtils math=new MathUtils();
        int multiply = doAction(a,b,MathUtils::multiply);
        System.out.println(a+ "*" +b+ "=" +multiply);

        int minus=doAction(a,b,MathUtils::minus);
        System.out.println(a+ "-" +b+ "=" +minus);
        System.out.println("==============");
        //tham chieu den motj instance method cua motj doi tuong tuy y cua motj kieu cu the
        String[] stringArray={"Java","C++","PHP","C#","JavaScript"};
        Arrays.sort(stringArray,String::compareToIgnoreCase);
        for (String str:stringArray){
            System.out.println(str);
        }
    }

    private static int doAction(int a, int b, ExecuteFuntion func) {
        return func.execute(a,b);
    }
}

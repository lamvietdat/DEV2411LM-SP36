package com.devmaster.lesson01.lamda_expression;

public class LamdaExpression3 {
    public static void main(String[] args) {
        Calculator1 calc1=(int a,int b)->{
            System.out.printf("\n %d + %d = %d\n",a,b,a+b);
        };
        calc1.add(10,20);

        calc1 = (a,b)-> System.out.printf("\n %d + %d = %d\n",a,b,a+b);
        calc1.add(10,22);

        Calculator2 calculator2=(int a, int b )->{
            return a+b;
        };
        System.out.printf("\n %d + %d = %d\n",10,20,calculator2.add(10,20));

        Calculator2 calc4=(a,b)->{
            int sum=a+b;
            System.out.printf(+a+ "+" +b+ "=" +sum);
            return null;
        };
        calc4.add(10,20);
    }
}

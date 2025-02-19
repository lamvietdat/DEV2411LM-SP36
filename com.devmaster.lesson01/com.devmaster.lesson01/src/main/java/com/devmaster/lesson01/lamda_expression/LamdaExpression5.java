package com.devmaster.lesson01.lamda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book{
    int id;
    String name;
    float price;

    public Book(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class LamdaExpression5 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1,"Java",9.95f));
        books.add(new Book(2,"Java SpringBoot",19.95f));
        books.add(new Book(3,"PHP Laravel",12.95f));
        books.add(new Book(4,"NetCore APT",29.95f));
        books.add(new Book(5,"JavaScript",29.95f));

        Stream<Book> filter= books.stream().filter(b->b.price>15);
        filter.forEach(System.out::println);
        System.out.println("=================");
        books.stream().filter(b->b.price<15).forEach(System.out::println);
    }
}

package com.devmaster.lesson01.pkg_stream_api;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    List<Integer> integers= Arrays.asList(11,232,112,43,66,44);
    //dem cac so chan
    //khong dung stream

    public void withoutStream(){
        int count=0;
        for(Integer integer:integers){
            if(integer%2==0) count++;
        }
        System.out.println("Số phần tử chẵn: "+count);
    }
    //dung stream
    public void withStream(){
        long count = integers.stream().filter(num->num%2==0).count();
        System.out.println("Số phần tử chẵn: "+count);
    }

    public static void main(String[] args) {
        StreamExample streamExample = new StreamExample();
        streamExample.withoutStream();
        streamExample.withStream();
    }
}

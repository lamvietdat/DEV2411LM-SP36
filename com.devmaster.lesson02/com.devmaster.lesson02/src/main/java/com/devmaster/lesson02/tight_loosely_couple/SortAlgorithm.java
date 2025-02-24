package com.devmaster.lesson02.tight_loosely_couple;

import java.util.Arrays;

public interface SortAlgorithm {
    void    sort(int[] array);
}

class LooselyBubblaSortAlgithm implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorted using bubble sort algorithm");
        Arrays.stream(array).sorted().forEach(System.out::println);
    }
}

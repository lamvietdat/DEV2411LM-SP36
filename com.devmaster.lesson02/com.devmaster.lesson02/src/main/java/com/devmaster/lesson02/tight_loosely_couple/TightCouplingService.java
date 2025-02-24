package com.devmaster.lesson02.tight_loosely_couple;

import java.util.Arrays;

//liên kết chặt chẽ
class BubbleSortAlgoristhm{
    public void sort(int[] arr){
        System.out.println("Sắp xếp theo giải thuật BubbleSort: ");
        int n=arr.length;
        boolean swapper;
        for (int i = 0; i < n; i++) {
            swapper=false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapper=true;
                }
            }
            if(!swapper){
                break;
            }
        }
    }
}

public class TightCouplingService {
    private BubbleSortAlgoristhm bubbleSortAlgoristhm=new BubbleSortAlgoristhm();
    public TightCouplingService(){};
    public TightCouplingService(BubbleSortAlgoristhm bubbleSortAlgoristhm){
        this.bubbleSortAlgoristhm=bubbleSortAlgoristhm;
    }
    public void complexBussinessSort(int[] arr){
        bubbleSortAlgoristhm.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        TightCouplingService tightCouplingService=new TightCouplingService();
        tightCouplingService.complexBussinessSort(new int[]{11,22,54,65,32,21});
    }
}

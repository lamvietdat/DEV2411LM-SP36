package com.devmaster.lesson02.tight_loosely_couple;

public class LooselyCoupleSrevice {
    private  SortAlgorithm sortAlgorithm;
    public LooselyCoupleSrevice(){};
    public LooselyCoupleSrevice(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm=sortAlgorithm;
    }
    public void complexBusiness (int[] arr){
        sortAlgorithm.sort(arr);
    }

    public static void main(String[] args) {
        LooselyCoupleSrevice sortAlgorithm=new LooselyCoupleSrevice(new LooselyBubblaSortAlgithm());
        sortAlgorithm.complexBusiness((new int[]{12,343,23,24545,32}));
    }
}

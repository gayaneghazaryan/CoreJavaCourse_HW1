package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        int[] l = {1,5,2,4,3};
        bubbleSort(l);
        for (int j : l) {
            System.out.print(j + " ");
        }
    }
    public static void bubbleSort(int[] arr) {
        int l = arr.length;
        boolean check = true;
        while(check) {
            check = false;
            for(int i = 0; i < l-1; i++) {
                for(int j = 0; j < l-1-i; j++) {
                    if(arr[j] > arr[j+1]) {
                        arr[j] = arr[j] ^ arr[j+1];
                        arr[j+1] = arr[j] ^ arr[j+1];
                        arr[j] = arr[j] ^ arr[j+1];
                        check = true;
                    }
                }
            }
        }
    }

}

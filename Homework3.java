package com.company;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Task 1 - Array filled with 2s");
        int[] array1 = new int[10];
        for(int i = 0; i < array1.length; i++) {
            array1[i] = 2;
        }

        for(int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n\nTask 2 - Array filled with numbers from 1:1000");
        int[] array2 = new int[1000];
        for(int i = 0; i < array2.length; i++) {
            array2[i] = i+1;
        }

        for(int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println("\n\nTask 3 - odd numbers from -20:20");
        int[] array3 = new int[20];
        int index = 0;
        for(int i = -20; i <=20; i++) {
            if(i % 2 != 0) {
                array3[index++] = i;
            }
        }

        for(int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

        System.out.println("\n\nTask 4 - elements of the array that can be divided by 5");
        int[] array4 = new int[] {1,3,4,6,5,7,8,10,12,15};
        for(int i = 0; i < array4.length; i++) {
            if(array4[i] % 5 == 0) {
                System.out.print(array4[i] + " ");
            }
        }

        System.out.println("\n\nTask 5 - elements of the array between 24.12 and 467.23");
        double[] array5 = new double[] {25.16, 23.43, 135.13, 34, 234.1, 543.2, 10.3, 56.76, 285.2, 24.5};
        for(int i = 0; i < array5.length; i++) {
            if(array5[i] >= 24.12 && array5[i] <= 467.23) {
                System.out.print(array5[i] + " ");
            }
        }

        System.out.println("\n\nTask 6 - count of the elements of the array that can be divided by 2");
        int[] array6 = new int[] {1,4,3,5,8,6,7,23,1,10,35,46,53,48,126,328,525};
        int count = 0;
        for(int i = 0; i < array6.length; i++) {
            if(array6[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("\nTask 7 - Multiplication table of the given integer");
        int n = 2;
        for(int i = 1; i <=10; i++) {
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }

    }
}

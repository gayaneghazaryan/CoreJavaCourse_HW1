package com.company;

public class Homework2 {
    public static void main(String[] args) {
        int a,b = 86, c; //a,b,c are declared, b is initialized with the value of 86
        a = ++b; // ++b means that the value of b is incremented and then assigned to a, therefore a = 87, b = 87
        c = a++; // a++ means that the value of a is assigned to c and then incremented, therefore c = 87, a = 88

        int d = c/2; //integer division (d = 87 / 2 = 43)
        a *= 2; // a = a * 2 (a = 176)
        b -= 5; // b = b-5 (b = 82)
        c += 4; // c = c + 4 (c = 91)
        a /= 3; // a = a/3 = 176 / 3 = 58;

        if ( c % 2 == 0) // if the number divided by 2 has the remainder 0, then the number is even, otherwise the number is odd
            System.out.println("c is even");
        else // c % 2 != 0
            System.out.println("c is odd");

        if(a == b)
            System.out.println("a and b are equal");
        else // a != b
            System.out.println("a and b are not equal");

        if(a < c)
            System.out.println("a is smaller than c");
        else if ( a > c)
            System.out.println("a is bigger than c");
        else // a == c
            System.out.println("a is equal to c");

        if(a > b && a > c)
            System.out.println("a is the biggest number");
        else if ( b > a && b > c )
            System.out.println("b is the biggest number");
        else if( c > a && c > b)
            System.out.println("c is the biggest number");

        if( d >= b || d <= a) { //true
            d++; // d = d+1 (d = 83 + 1 = 84)
            System.out.println("d has been incremented");
        } else {
            // !( d >= b || d <= a) = !(d >= b) && !(d <= a) = (d < b) && (d > a)
            d--; // d = d-1
            System.out.println("d has been decremented");
        }

        //a = 58
        //b = 84
        //c = 91
        //d = 84

        int e = (b+2) | (c-4); //(1010100) | (1010111) = (1010111), e = 87
        int f = a & e; // (111010 & 1010111) = (0010010), f = 18
        f <<= 2; //f = f << 2 ( 10010 << 2 = 1001000), f = 72
        int g = e ^ f; // (1010111) ^ (1001000) = (0011111), g = 31
        int h = ~(g-1); // ~(0000 0000 0000 0000 0000 0000 0001 1110) = (1111 1111 1111 1111 1111 1111 1110 0001), h = -31

        boolean j = (g == -h); //true

        int[] myArray = new int[] {a,b,c,d,e,f,g,h};
        myArray[0] = 1; // the value under the first index is changed to 1
        myArray[myArray.length-1] = 10; // the value under the last index is changed to 10

        String k = myArray.length > 0 ? "Array has at least one element": "Array is empty";


    }
}

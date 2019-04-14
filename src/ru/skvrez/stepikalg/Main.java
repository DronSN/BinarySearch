package ru.skvrez.stepikalg;

import java.util.Scanner;

public class Main {

    static int biSearch(int srch, int[] ar) {
        int l=0;
        int r=ar.length-1;
        int m;
        while (l<=r){

            m=(l+r)/2;

            if (ar[m] == srch) {
                return (m +1);
            }
            else if (ar[m]>srch) {
                r=m-1;
            }
            else {
                l=m+1;
            }

        }
         return -1;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = input.nextInt();
        }
        int k = input.nextInt();
        int b;
        StringBuilder out = new StringBuilder();
        for (int j = 0; j < k; j++) {
            b = input.nextInt();
            out.append(biSearch(b, ar) + " ");

        }
        System.out.println(out);
    }
}

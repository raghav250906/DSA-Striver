package a_Basics;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = divisors(n);

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }

        System.out.print("]");
    }

    public static int[] divisors(int n) {
        int size = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) size++;
        }

        int[] arr = new int[size];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[index] = i;
                index++;
            }
        }

        return arr;
    }
}

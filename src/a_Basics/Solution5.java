package a_Basics;

import java.util.Scanner;
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
    public static boolean isArmstrong(int n) {
        int count = 0;
        int a = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        n=a;
        int sum = 0;
        while (n>0) {
            int power=1;
            int digit = n % 10;
            for(int i=0;i<count;i++){
                power = power*digit;
            }
            sum = sum + power;
            n=n/10;
        }
        return a == sum;
    }
}

package a_Basics;

import java.util.Scanner;
public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n) {
        int divisor = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                divisor++;
            }
            if(divisor>2) {
                return false;
            }
        }
        return true;
    }
}

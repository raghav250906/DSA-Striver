package a_Basics;

import java.util.Scanner;
public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("To print: ");
        String a = sc.nextLine();
        System.out.print("Times: ");
        int b= sc.nextInt();
        recursion(a,b);
    }
    public static void recursion(String a,int n){
        if(n>0){
            System.out.println(a);
            n--;
            recursion(a,n);
        }
        return;
    }
}

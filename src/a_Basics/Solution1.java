package a_Basics;

class Solution1 {
    public static int countDigit(int n) {
        int count= 1;
        int a =n/10;
        if(n==0){
            return a+1;
        }
        while(a != 0){
            a=a/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigit(-234));
    }
}
package a_Basics;

public class Solution14 {
    public static void main(String[] args) {
        String s = "hannah";
        System.out.println(palindromeCheck(s));
    }
    public static boolean palindromeCheck(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<s.length()){
            if(s.charAt(right) != s.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

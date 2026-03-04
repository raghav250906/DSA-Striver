package a_Basics;

public class Solution4 {
    public static int GCD(int n1, int n2) {
        int n = (n1<n2 ? n1 : n2);
        for(int i =n; i>0; i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(GCD(9,8));
    }
}

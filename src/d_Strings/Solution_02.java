package d_Strings;

public class Solution_02 {
    public static void main(String[] args) {
        String s ="welcome to the jungle";
        String a =reverseWords(s);
        System.out.println(a);
    }
    public static String reverseWords(String s) {
        int n = s.length();
        int i=n-1;
        StringBuilder ans = new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            if(i<0) break;
            int j=i;
            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }
            if(ans.length()>0) ans.append(" ");
            ans.append(s.substring(i+1,j+1));
        }
        return ans.toString();
    }
}

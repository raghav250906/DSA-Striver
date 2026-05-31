package g_Bit_Manipulation;
public class Solution_10 {
    public static int findXOR(int l, int r) {
        return xor1ToN(l-1) ^ xor1ToN(r);
    }
    static int xor1ToN(int n){
        if(n%4==0) return n;
        else if(n%4==1) return 1;
        else if(n%4==2) return n+1;
        else return 0;
    }
}

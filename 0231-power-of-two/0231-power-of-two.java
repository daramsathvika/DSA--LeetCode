class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){return true;}
        if(n<=0){return false;}
        return isExponent(n)==n;
    }
    public int isExponent(int n){
        if(n%2!=0){return n%2;}
        return 2*isExponent(n/2);
    }
}
class Solution {
    public static void reverseString(char[] s) {
        int n=s.length,left=0,right=n-1;
        reverse(s,left,right);
    }
    public static void reverse(char[] s,int left,int right){
            if(left>=right){return ;}
            char temp = s[left];s[left]=s[right];s[right]=temp;
            reverse(s,left+1,right-1);
        }
}
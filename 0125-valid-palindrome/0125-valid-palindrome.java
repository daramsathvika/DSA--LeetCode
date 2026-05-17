class Solution {
    public boolean isPalindrome(String str) {
        int i=0,n=str.length(),k=0;
        char arr[] = new char[n];
        String s = str.toUpperCase();
        for(i=0;i<n;i++){
            if(s.charAt(i)>=65&&s.charAt(i)<=90||s.charAt(i)>=48&&s.charAt(i)<=57){arr[k++]=s.charAt(i);}
        }
        for(i=0;i<k;i++){
            if(arr[i]!=arr[k-1-i]){return false;}
        }
        return true;
    }
}
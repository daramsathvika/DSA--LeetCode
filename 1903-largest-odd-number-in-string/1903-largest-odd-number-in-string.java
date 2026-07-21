class Solution {
    public String largestOddNumber(String num) {
        int ans=-1,i,j,n=num.length();
        char arr[] = num.toCharArray();
        for(i=n-1;i>=0;i--){
            if((arr[i]-'0')%2==1){ans=i;break;}
        }
        return num.substring(0,ans+1);
    }
}
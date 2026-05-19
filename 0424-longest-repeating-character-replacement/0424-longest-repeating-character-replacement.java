class Solution {
    public int characterReplacement(String s, int k) {
        int i,n=s.length(),max=0;
        int freq[] = new int[26];
        if(k>=n){return n;}
        if(n<2){return n+k;}
        int left=0,right=0,len=right-left+1;
        while(left<=right&&right<n){
            freq[s.charAt(right)-'A']++;
            max=Math.max(max,freq[s.charAt(right)-'A']);
            if(right-left+1>max+k){freq[s.charAt(left)-'A']--;left++;}
            len=right-left+1;
            right++;
        }
        return len;
    }
}
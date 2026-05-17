class Solution {
    public boolean isAnagram(String s, String t) {
        int i=0,n=s.length(),m=t.length();
        if(m!=n){return false;}
        int arr[] = new int[26];
        for(i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(i=0;i<26;i++){if(arr[i]!=0){return false;}}
        return true;
    }
}
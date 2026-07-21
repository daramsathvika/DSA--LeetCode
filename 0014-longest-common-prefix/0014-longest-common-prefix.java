class Solution {
    public String longestCommonPrefix(String[] strs) {
        int end=-1;
        char c;int i=0;
        while(i<strs[0].length()){
            c=strs[0].charAt(i);
            for(String s:strs){
                if(i>=s.length()||s.charAt(i)!=c){
                    return strs[0].substring(0,end+1);
                }
            }end=i;i++;
        }
        return strs[0].substring(0,end+1);
    }
}
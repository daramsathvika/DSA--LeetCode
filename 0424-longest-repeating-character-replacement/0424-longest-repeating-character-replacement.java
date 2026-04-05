class Solution {
    public int characterReplacement(String s, int k) {
        int i,n=s.length(),count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(i=0;i<n;i++){
            map.put(s.charAt(i),0);
        }
        int left=0,right=0,ans=0;
        while(left<=right&&right<n){
            map.put(s.charAt(right),map.get(s.charAt(right))+1);
            if(map.get(s.charAt(right))>count){count=map.get(s.charAt(right));}
            if(count+k<(right-left+1)){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;}
            else if(count+k>=(right-left+1)){ans=right-left+1;}
            right++;
        }
        return ans;
    }
}
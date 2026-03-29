class Solution {
    public boolean isAnagram(String s, String t) {
        int i,m=s.length(),n=t.length();
        if(m!=n){return false;}
        HashMap<Character,Integer> map = new HashMap<>();
        for(i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }
        for(char k:map.keySet()){
            if(map.get(k)!=0){return false;}
        }
        return true;
    }
}
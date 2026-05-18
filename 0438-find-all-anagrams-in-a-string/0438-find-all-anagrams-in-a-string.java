class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        int i,j,m=p.length(),n=s.length();
        if(m>n){return list;}
        for(i=0;i<m;i++){
            arr1[p.charAt(i)-'a']++;
        }
        for(i=0;i<m;i++){
            arr2[s.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2)){list.add(0);}
        }
        for(i=0;i<n-m;i++){
            arr2[s.charAt(i)-'a']--;arr2[s.charAt(i+m)-'a']++;
            if(Arrays.equals(arr1,arr2)){list.add(i+1);}
        }
        return list;
    }
}
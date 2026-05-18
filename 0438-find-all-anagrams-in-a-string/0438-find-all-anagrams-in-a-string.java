class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int arr1[] = new int[26];
        int i,j,m=p.length(),n=s.length();
        for(i=0;i<m;i++){
            arr1[p.charAt(i)-'a']++;
        }
        for(i=0;i<n-m+1;i++){
            int arr2[] = new int[26]; 
            for(j=i;j<i+m;j++){arr2[s.charAt(j)-'a']++;}
            if(Arrays.equals(arr1,arr2)){list.add(i);}
        }
        return list;
    }
}
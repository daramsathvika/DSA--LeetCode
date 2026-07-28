class Solution {
    public String smallestPalindrome(String s) {
        int i,n=s.length();if(n==1){return s;}
        int arr[] = new int[n/2];
        for(i=0;i<n/2;i++){
            arr[i]=s.charAt(i)+1-'a';
        }
        Arrays.sort(arr);
        StringBuilder lefthalf = new StringBuilder("");
        for(i=0;i<n/2;i++){
            lefthalf.append((char)('a'+arr[i]-1));
        }
        StringBuilder righthalf= new StringBuilder(lefthalf);
        righthalf.reverse();
        if(n%2==1){lefthalf.append(s.charAt(n/2));}
        lefthalf.append(righthalf);
        return lefthalf.toString();
    }
}
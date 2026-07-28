class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        String leftpart = s.substring(0,n/2);
        char[] left = leftpart.toCharArray();
        Arrays.sort(left);
        StringBuilder lefthalf = new StringBuilder("");
        for(char c:left){lefthalf.append(c);}
        StringBuilder righthalf=new StringBuilder(lefthalf);
        righthalf.reverse();
        if(n%2==1){lefthalf.append(s.charAt(n/2));}
        lefthalf.append(righthalf);
        return lefthalf.toString();
    }
}
class Solution {
    public int maxDepth(String s) {
        int open=0,n=s.length(),max=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){open++;if(open>max){max=open;}}
            else if(s.charAt(i)==')'){open--;}
        }
        return max;
    }
}
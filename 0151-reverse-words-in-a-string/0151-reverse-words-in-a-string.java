class Solution {
    public String reverseWords(String s) {
        int i=0,n=s.length();
        Stack<String> st = new Stack<>();
        StringBuilder sb,ans;
        while(i<n){
            sb= new StringBuilder("");
            while(i<n&&s.charAt(i)!=' '){sb.append(s.charAt(i));i++;}
            String word = sb.toString();
            if(word.length()>0){st.push(word);}
            i++;
            while(i<n&&s.charAt(i)==' '){i++;}
        }
        ans=new StringBuilder("");
        while(!st.isEmpty()){
            ans.append(st.pop());
            if(st.size()>0){ans.append(' ');}
        }
        return ans.toString();
    }
}
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i=0,n=s.length();
        for(i=0;i<n;i++){
            if(s.charAt(i)==')'){
                if(!st.isEmpty()&&st.peek()=='('){st.pop();} 
                else{System.out.print(s.charAt(i));return false;}
            }          
            else if(s.charAt(i)=='}'){
                if(!st.isEmpty()&&st.peek()=='{'){st.pop();} 
                else{System.out.print(s.charAt(i));return false;}
            }          
            else if(s.charAt(i)==']'){
                if(!st.isEmpty()&&st.peek()=='['){st.pop();} 
                else{System.out.print(s.charAt(i));return false;}
            }          
            else{st.push(s.charAt(i));}
        }
        if(st.size()==0){return true;}
        return false;
    }
}
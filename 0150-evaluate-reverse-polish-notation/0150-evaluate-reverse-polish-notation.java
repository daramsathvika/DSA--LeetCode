class Solution {
    public int evalRPN(String[] s) {
        Stack<Integer> s1 =new Stack<>();
        for(int i=0;i<s.length;i++){
            if(s[i].equals("+")&&s1.size()>1){
                s1.push(s1.pop()+s1.pop());
                }
            else if(s[i].equals("-")&&s1.size()>1){
                int top =s1.pop();
                s1.push(s1.pop()-top);
                }
            else if(s[i].equals("*")&&s1.size()>1){
                s1.push(s1.pop()*s1.pop());
                }
            else if(s[i].equals("/")&&s1.size()>1){
                int top =s1.pop();
                if(top==0){continue;}
                else{s1.push(s1.pop()/top);}
                }
            else{s1.push(Integer.parseInt(s[i]));}
        }
        return s1.peek();
    }
}
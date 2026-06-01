class Solution {
    public int evalRPN(String[] s) {
        Stack<Integer> s1 =new Stack<>();
        Stack<Character> s2 =new Stack<>();
        for(int i=0;i<s.length;i++){
            if((s[i].charAt(0)-'0'>=0&&s[i].charAt(0)-'0'<=9)||(s[i].charAt(0)=='-'&&s[i].length()>1)){
                s1.push(Integer.parseInt(s[i]));
                //System.out.println(s1.peek());
                }
            else if(s[i].charAt(0)=='+'&&s1.size()>1){
                s1.push(s1.pop()+s1.pop());
                //System.out.println(s1.peek());
                }
            else if(s[i].charAt(0)=='-'&&s1.size()>1){
                int top =s1.pop();
                s1.push(s1.pop()-top);
                //System.out.println(s1.peek());
                }
            else if(s[i].charAt(0)=='*'&&s1.size()>1){
                s1.push(s1.pop()*s1.pop());
                //System.out.println(s1.peek());
                }
            else if(s[i].charAt(0)=='/'&&s1.size()>1){
                int top =s1.pop();
                if(top==0){continue;}
                else if(top<0^s1.peek()<0){s1.push(-1*(Math.abs(s1.pop())/Math.abs(top)));}
                else{s1.push(s1.pop()/top);}
                //System.out.println(s1.peek());
                }
            else{continue;}
        }/*
        while(s1.size()>1){
            if(s2.pop()=='+'){s1.push(s1.pop()+s1.pop());}
            else if(s2.pop()=='-'){s1.push(s1.pop()-s1.pop());}
            else if(s2.pop()=='*'){s1.push(s1.pop()*s1.pop());}
            else if(s2.pop()=='/'){s1.push(s1.pop()/s1.pop());}
        }*/
        return s1.peek();
    }
}
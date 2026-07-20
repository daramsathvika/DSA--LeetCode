class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder("");
        int n=s.length(),open=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                Queue<Character> q = new LinkedList<>();
                q.offer(s.charAt(i));i++;open=1;
                while(q.size()>0&&i<n){
                    if(open==1&&s.charAt(i)==')'){break;}
                    q.offer(s.charAt(i));
                    if(s.charAt(i)=='('){open++;}
                    else if(s.charAt(i)==')'){open--;}
                i++;
                }
                q.poll();
                while(q.size()>0){sb.append(q.poll());}
            }
        }
        String ans=sb.toString();
        return ans;
    }
}
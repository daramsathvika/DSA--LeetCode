class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int i,n=temps.length;
        Deque<Integer> st =new ArrayDeque<>();
        int[]arr= new int[n];
        Arrays.fill(arr,0);st.push(n-1);
        for(i=n-2;i>=0;i--){
            while(!st.isEmpty()&&temps[i]>=temps[st.peek()]){st.pop();}
            if(!st.isEmpty()){arr[i]=st.peek()-i;}
            st.push(i);
        }
        return arr;
    }
}
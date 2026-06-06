class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int i,n=temps.length;
        Stack<Integer> st =new Stack<>();
        int[]arr= new int[n];
        Arrays.fill(arr,0);st.push(n-1);
        for(i=n-2;i>=0;i--){
            while(st.size()>0&&temps[i]>=temps[st.peek()]){st.pop();}
            if(st.size()>0){arr[i]=st.peek()-i;}
            st.push(i);
        }
        return arr;
    }
}
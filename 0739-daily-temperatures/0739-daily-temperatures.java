class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int i,n=temps.length;
        int arr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(arr,0);
        st.push(0);
        for(i=1;i<n;i++){
            while(st.size()>0&&temps[i]>temps[st.peek()]){
                int k=st.peek();
                arr[k]=i-st.pop();
            }
            //arr[i]=i-st.peek();
            st.push(i);
        }
        return arr;
    }
}
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();int n=nums.length;
        int[] nge = new int[n];
        Arrays.fill(nge,-1);
        st.push(n-1);
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&nums[st.peek()]<nums[i]){
                nge[st.pop()]=nums[i];
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&nums[st.peek()]<nums[i]){
                nge[st.pop()]=nums[i];
            }
            st.push(i);
        }
        return nge;
    }
}
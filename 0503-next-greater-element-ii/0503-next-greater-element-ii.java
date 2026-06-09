class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length,i;
        int[] nge = new int[n];
        Arrays.fill(nge,-1);
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> set = new HashSet<>();
        for(i=0;i<2*n-1;i++){
            while(!st.isEmpty()&&nums[st.peek()]<nums[i%n]){nge[st.pop()]=nums[i%n];}
            st.push(i%n);
        }
        return nge;
    }
}
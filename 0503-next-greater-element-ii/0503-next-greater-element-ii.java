class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length,i;
        int[] nge = new int[n];
        Arrays.fill(nge,-1);
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> set = new HashSet<>();
        for(i=0;i<n;i++){
            while(!st.isEmpty()&&nums[st.peek()]<nums[i]){nge[st.pop()]=nums[i];}
            st.push(i);
        }
        for(i=0;i<n;i++){
            while(!st.isEmpty()&&nums[st.peek()]<nums[i]){
                nge[st.pop()]=nums[i];}
            if(st.isEmpty()){break;}
            st.push(i);
        }
        return nge;
    }
}
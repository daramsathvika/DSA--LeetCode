class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int i,n=nums2.length,m=nums1.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        st.push(nums2[0]);
        for(i=0;i<n;i++){
            while(st.size()>0&&st.peek()<nums2[i]){
                map.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        int []op = new int[m];
        for(i=0;i<m;i++){
            op[i]=map.getOrDefault(nums1[i],-1);
        }
        return op;
    }
}
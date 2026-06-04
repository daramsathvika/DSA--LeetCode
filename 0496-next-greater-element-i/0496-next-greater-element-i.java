class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int i,n=nums2.length,m=nums1.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        st.push(nums2[n-1]);map.put(nums2[n-1],-1);
        for(i=n-2;i>=0;i--){
            while(st.size()>0&&nums2[i]>=st.peek()){st.pop();}
            if(st.size()>0){map.put(nums2[i],st.peek());}
            st.push(nums2[i]);
        }
        int []op = new int[m];
        for(i=0;i<m;i++){
            op[i]=map.getOrDefault(nums1[i],-1);
        }
        return op;
    }
}
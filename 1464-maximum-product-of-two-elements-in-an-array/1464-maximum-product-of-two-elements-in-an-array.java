class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE,secondmax=Integer.MIN_VALUE,i,n=nums.length;
        for(i=0;i<n;i++){
            if(nums[i]>max){secondmax=max;max=nums[i];}
            else if(nums[i]>secondmax&&!(nums[i]>max)){secondmax=nums[i];}
        }
        return (max-1)*(secondmax-1);
    }
}
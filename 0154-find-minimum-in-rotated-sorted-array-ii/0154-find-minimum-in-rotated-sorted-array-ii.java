class Solution {
    public int findMin(int[] nums) {
        int n=nums.length,left=0,right=n-1,mid=0;
        //if(nums[mid]>=nums[left]&&nums[right]>=nums[mid]){return nums[left];}
        while(left<=right){
            mid=(left+right)/2;
            if(left==right){return nums[mid];}
            if(nums[mid]>nums[right]){
                left=mid+1;}
            else if(nums[mid]<nums[right]){right=mid;}
            else{right--;}}
        return nums[mid];
    }
}
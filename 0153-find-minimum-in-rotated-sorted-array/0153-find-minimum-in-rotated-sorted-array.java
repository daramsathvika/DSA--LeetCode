class Solution {
    public int findMin(int[] nums) {
        int n=nums.length,left=0,right=n-1,mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]<nums[right]){right=mid;}
            else{left=mid+1;}           
        }
        return nums[mid];
    }
}
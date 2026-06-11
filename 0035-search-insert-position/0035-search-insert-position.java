class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,n=nums.length,right=n-1,mid=0,ans=n;
        while(left<=right&&right<n){
            mid=(left+right)/2;
            if(nums[mid]>=target){
                ans=mid;right=mid-1;
            }
            else{left=mid+1;}
        }
        return ans;
    }
}
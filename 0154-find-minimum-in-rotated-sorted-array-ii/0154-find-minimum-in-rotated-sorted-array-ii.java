class Solution {
    public int findMin(int[] nums){
        int left=0,n=nums.length,right=n-1,mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(left==right){return nums[mid];}
            if(nums[mid]<nums[right]){right=mid;}
            else if(nums[mid]>nums[right]){left=mid+1;}
            else{right--;}
        }
        return nums[mid];
    }
}
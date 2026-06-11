class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length,left=0,right=n-1,mid=0;
        if(n==1||nums[0]>nums[1]){return 0;}
        else if(nums[n-1]>nums[n-2]){return n-1;}
        else{
            while(left<=right&&right<n){
                mid=(left+right)/2;
                if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){return mid;}
                else if(nums[mid]>nums[mid+1]){right=mid;}
                else{left=mid;}
            }
        }
        return mid;
    }
}
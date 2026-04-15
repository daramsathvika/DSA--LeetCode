class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length,left=0,right=n-1,mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(target==nums[mid]){return mid;}
            if(nums[mid]<nums[right]){
                if(nums[mid]<target&&nums[right]>=target){left=mid+1;}
                else{right=mid-1;}
            }
            else{
                if(nums[left]<=target&&target<nums[mid]){right=mid-1;}
                else{left=mid+1;}
            }
        }
        return -1;
    }
}
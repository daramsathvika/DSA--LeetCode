class Solution {
    public int search(int[] nums, int target) {
        int i=0,n=nums.length,left=0,right=n-1,mid=0;
        while(left<=right&&right<n){
            mid=(left+right)/2;
            if(nums[mid]==target){return mid;}
            if(nums[mid]<nums[right]){//sorted right
                if(target>nums[right]||target<nums[mid]){right=mid-1;}
                else{left=mid+1;}
            }
            else{//sorted left
                if(target<nums[left]||target>nums[mid]){left=mid+1;}
                else{right=mid-1;}
            }
        }
        return -1;
    }
}
class Solution {
    public int findMin(int[] nums) {
        int i,n=nums.length,left=0,right=n-1,mid=(left+right)/2;
        if(n<=2){return Math.min(nums[0],nums[n-1]);}
        while(left<right){
            if(nums[mid]<nums[mid+1]&&nums[mid]>=nums[left]){
                left=mid+1;}
            else{right=mid;}
            mid=(left+right)/2;
        }
        if(mid+1<n){return nums[mid+1];}
        else{return nums[0];}
    }
}
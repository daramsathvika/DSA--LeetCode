class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length,left=0,right=n-1,mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(left==right){break;}
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }
            else{right=mid;}
        }
        return mid;
    }
}
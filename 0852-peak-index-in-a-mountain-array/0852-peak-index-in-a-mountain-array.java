class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int n=nums.length,left=0,right=n-1,mid;
        while(left<=right&&right<n){
            mid=(left+right)/2;
            if(mid==0||mid==n-1){break;}
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){return mid;}
            else if(mid<n-1&&nums[mid]>nums[mid+1]){right=mid;}
            else{left=mid;}
        }
        return ((nums[0]>nums[n-1]) ? 0 : n-1) ;
    }
}
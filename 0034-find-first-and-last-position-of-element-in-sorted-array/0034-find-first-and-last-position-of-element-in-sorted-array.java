class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,n=nums.length,right=n-1,mid=(left+right)/2;
        boolean found=false;
        int arr[] = {-1,-1};
        while(left<=right&&right<n){
            mid=(left+right)/2;
            if(nums[mid]==target){found=true;break;}
            else if(nums[mid]<target){left=mid+1;}
            else{right=mid-1;}
        }
        if(!found){return arr;}
        left=mid;right=mid;arr[0]=left;arr[1]=right;
        while(left>=0&&nums[left]==target){arr[0]=left;left--;}
        while(right<n&&nums[right]==target){arr[1]=right;right++;}
        return arr;
    }
}
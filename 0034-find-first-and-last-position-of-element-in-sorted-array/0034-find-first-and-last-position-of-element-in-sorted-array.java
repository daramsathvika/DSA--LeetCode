class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length,left=0,right=n,mid=(left+right)/2;
        int arr[] = new int[2];
        Arrays.fill(arr,-1);
        while(left<=right&&mid<n){
            if(nums[mid]==target){
                left=mid;right=mid;
                while(nums[left]==target){arr[0]=left;if(left<=0){break;}left--;}
                while(nums[right]==target){arr[1]=right;if(right>=n-1){break;}right++;}
                return arr;
            }
            else if(nums[mid]<target){left=mid+1;}
            else {right=mid-1;}
            if(mid==(left+right)/2){break;}
            else{mid=(left+right)/2;}
            
        }
        return arr;      
    }
}
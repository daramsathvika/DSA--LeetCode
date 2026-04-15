class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length,left=0,right=n-1,mid=0,arr[]=new int[2];
        Arrays.fill(arr,-1);
        while(left<=right){
            mid=(left+right)/2;
            if(target==nums[mid]){
                right=mid;left=mid;
                while(target==nums[right]){arr[1]=right;if(right==n-1){break;}right++;}
                while(target==nums[left]){arr[0]=left;if(left==0){break;}left--;}
                return arr;
            }
            else if(target<nums[mid]){right=mid-1;}
            else{left=mid+1;}
        }
        return arr;
    }
}
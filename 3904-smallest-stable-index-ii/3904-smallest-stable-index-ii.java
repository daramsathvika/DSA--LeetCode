class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int i=0,n=nums.length,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,minstain=0,index=0;
        int arr[] = new int[n];
        for(i=n-1;i>=0;i--){
            if(nums[i]<min){min=nums[i];}
            arr[i]=min;
        }
        for(i=0;i<n;i++){
            if(nums[i]>max){max=nums[i];}
            nums[i]=max-arr[i];
            if(nums[i]<=k){return i;}
        }
        return -1;
    }
}
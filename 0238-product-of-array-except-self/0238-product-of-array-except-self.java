class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroes=0,i,n=nums.length,product=1,index=-1;
        for(i=0;i<n;i++){
            if(nums[i]==0){zeroes++;index=i;if(zeroes>1){return new int[n];}}
            else{product*=nums[i];}
        }
        if(zeroes==1){int[] arr = new int[n];arr[index]=product;return arr;}
        for(i=0;i<n;i++){
            nums[i]=product/nums[i];
        }
        return nums;
    }
}
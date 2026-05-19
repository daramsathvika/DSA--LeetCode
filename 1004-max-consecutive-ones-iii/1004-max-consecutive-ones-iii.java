class Solution {
    public int longestOnes(int[] nums, int k) {
        int i,n=nums.length,left=0,right=0,len=right-left+1,sum=0;
        int arr[] = new int[n];
        if(Arrays.equals(arr,nums)&&k==0){return 0;}
        while(left<=right&&right<n){
            sum+=nums[right];
            while(sum+k<right-left+1&&left<n-1){sum-=nums[left];left++;}
            while(sum+k>right-left+1&&right<n-1){right++;sum+=nums[right];}
            len=Math.max(right-left+1,len);right++;
        }
        return len;
    }
}
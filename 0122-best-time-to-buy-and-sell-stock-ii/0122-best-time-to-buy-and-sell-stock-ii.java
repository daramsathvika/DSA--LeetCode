class Solution {
    public int maxProfit(int[] nums) {
        int ans=0,n=nums.length,i,left=0,right=1;
        while(left<=right&&right<n){
            while(right<n&&nums[right-1]<=nums[right]){
            //System.out.println(left+" "+right);
                ans+=nums[right]-nums[right-1];right++;}
            left=right;right=left+1;
        }   
        return ans;
    }
}
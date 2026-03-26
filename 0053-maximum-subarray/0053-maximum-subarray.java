class Solution {
    public int maxSubArray(int[] nums) {
        int i,n=nums.length,sum=0,min=0,max_sum=Integer.MIN_VALUE;
        boolean pos=false;
        for(i=0;i<n;i++){
            sum+=nums[i];
            if(max_sum<sum-min){max_sum=sum-min;}
            if(sum<min){min=sum;}//only either this statement or the above statement is true at a time so no need to wonder about writing else and  if we flip the order of placing these two conditions for negative numbers(array with no positive numbers) min gets update everytime and sum=min(as there are no positive numbers sum always goes incresing but in -ve) do sum-min =0 so max_sum always becomes 0 so we dont get our real answer
            
        }
        return max_sum;
    }
}
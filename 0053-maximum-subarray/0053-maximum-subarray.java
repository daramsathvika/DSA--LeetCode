class Solution {
    public int maxSubArray(int[] nums) {
        int i,n=nums.length,sum=0,min=0,max_sum=Integer.MIN_VALUE;
        boolean pos=false;
        for(i=0;i<n;i++){
            sum+=nums[i];
            if(nums[i]>0){pos=true;}
        }
        //if(pos==true){
            sum=0;
            for(i=0;i<n;i++){
                sum+=nums[i];
                if(max_sum<sum-min){max_sum=sum-min;}
                if(sum<min){min=sum;}
            }
        /*}
        else{sum=0;
            for(i=0;i<n;i++){
                sum+=nums[i];
                if(max_sum<sum-min){max_sum=sum-min;}
                if(sum<min){min=sum;}}
            }*/
        return max_sum;
    }
}
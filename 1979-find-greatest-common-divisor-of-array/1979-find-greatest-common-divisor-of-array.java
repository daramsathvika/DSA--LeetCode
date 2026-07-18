class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,i,n=nums.length,ans=1;
        for(i=0;i<n;i++){
            if(nums[i]<min){min=nums[i];}
            if(nums[i]>max){max=nums[i];}
        }
        // int left=1,right=min,mid=0;
        if(max%min==0){return min;}
        for(i=1;i<min;i++){
            if(min%i==0&&max%i==0){ans=i;}
        }
        return ans;
    }
}
class Solution {
    public boolean check(int[] nums) {
        boolean right=false;
        int i,n=nums.length;
        for(i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){break;}
        }
        if(i==n-1){return true;}
        else{
            for(i=i+1;i<n-1;i++){
                if(nums[i]>nums[i+1])return false;}
            if(nums[0]>=nums[n-1]){return true;}
            else{System.out.print(nums[0]);return false;}
        }
    }
}
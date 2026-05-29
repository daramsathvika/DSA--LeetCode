class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE,i=0,n=nums.length;
        while(i<n){
            int sum=0,k=nums[i];
            while(k>0){sum+=k%10;k=k/10;}
            if(sum<min){min=sum;}
            i++;
        }
        return min;
    }
}
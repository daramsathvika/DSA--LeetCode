class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length,i=n-1,end=i,j;
        while(i>=0){
            if(nums[i]==0){
                j=i;
                while(j<end){
                    nums[j]=nums[j+1];j++;
                }
                nums[end]=0;end--;
            }
            i--;
        }
    }
}
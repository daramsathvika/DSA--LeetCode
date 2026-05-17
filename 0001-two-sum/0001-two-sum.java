class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=i,n=nums.length;
        int arr[] = new int[2]; 
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){arr[0]=i;arr[1]=j;Arrays.sort(arr);return arr;}
            }
        }
        return arr;
    }
}
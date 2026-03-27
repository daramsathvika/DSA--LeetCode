class Solution {
    public int[] buildArray(int[] nums) {
        int i=0,n=nums.length;
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=nums[nums[i]];
        }
        for(i=0;i<n;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}
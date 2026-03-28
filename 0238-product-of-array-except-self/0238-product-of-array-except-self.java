class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,n=nums.length,prod=1;
        boolean zero=false,num=false;int k=0;
        int arr[] = new int[n];
        Arrays.fill(arr,0);
        for(i=0;i<n;i++){
            if(nums[i]==0&&zero==true){return arr;}
            else if(nums[i]==0){
                zero=true;k=i;continue;
            }
            if(nums[i]!=0){num=true;}
            prod=prod*nums[i];
        }
        if(zero==true){
            if(num==false){prod=0;}
            arr[k]=prod;
            return arr;
        }
        for(i=0;i<n;i++){
            arr[i]=prod/nums[i];
        }
        return arr;
    }
}
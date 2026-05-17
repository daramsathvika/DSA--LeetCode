class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i=0,n=nums.length,product=1,index=-1;
        int prod[] = new int[n];
        boolean zero=false,morezeroes=false;
        for(i=0;i<n;i++){
            if(nums[i]==0&&!zero){zero=true;index=i;continue;}
            else if(nums[i]==0&&zero){morezeroes=true;Arrays.fill(prod,0);return prod;}
            product*=nums[i];
        }
        if(zero){
            Arrays.fill(prod,0);
            prod[index]=product;
            return prod;
        }
        for(i=0;i<n;i++){
            prod[i] = product/nums[i];
        }
        return prod;
    }
}
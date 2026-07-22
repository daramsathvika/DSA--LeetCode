class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length,i,one,two;
        if(n==1){return nums;}
        int arr1[] = new int[n/2];
        int arr2[] = new int[n-n/2];
        for(i=0;i<n;i++){
            if(i>=n/2){arr2[i-n/2]=nums[i];}
            else{arr1[i]=nums[i];}
        }
        arr1 = sortArray(arr1);
        arr2 = sortArray(arr2);
        one=0;two=0;i=0;
        while(one<arr1.length&&two<arr2.length&&i<n){
            //System.out.println(one+" "+two);
            if(arr1[one]<arr2[two]){nums[i++]=arr1[one++];}
            else{nums[i++]=arr2[two++];}
        }
        while(one<arr1.length){nums[i++]=arr1[one++];}
        while(two<arr2.length){nums[i++]=arr2[two++];}
        return nums;
    }
}
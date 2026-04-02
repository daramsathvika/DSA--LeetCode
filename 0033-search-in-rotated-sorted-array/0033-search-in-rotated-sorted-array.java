class Solution {
    public int search(int[] nums, int target) {
        int i,n=nums.length,left=0,right=n-1,mid=0;
        while(left<=right&&n>2){
            mid =(left+right)/2;
            if(left==right){break;}
            if(nums[mid+1]>nums[mid]&&nums[mid]>nums[left]){left=mid+1;}
            else{right=mid;}
        }
        if(n<=2){
            for(i=0;i<n;i++){
                if(target==nums[i]){return i;}
            }
        }
        System.out.println(mid);
        if(target>=nums[0]){left=0;right=mid;}
        else{left=mid+1;right=n-1;}
        while(left<=right){
            mid=(left+right)/2;
            if(target==nums[mid]){return mid;}
            else if(target>nums[mid]){left=mid+1;}
            else{right=mid-1;}
        }
        return -1;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i,n=nums.length,len=0,sum=0,minlen=0;
        for(i=0;i<n;i++){
            sum+=nums[i];
            if(sum>=target){break;}
        }
        if(i==n&&target>sum){return 0;}
        len=i+1;minlen=len;
        int left=0,right=i;sum-=nums[right];
        System.out.println(sum);
        while(left<=right&&right<n){sum+=nums[right];
            while(sum<target&&right<n-1){right++;sum+=nums[right];}
            while(sum>target&&left<=right){if(right-left+1<minlen){minlen=right-left+1;}sum-=nums[left];left++;}
            len=right-left+1;
            //System.out.println(sum+" "+left+" "+right+" ");
            if(sum>=target&&right-left+1<minlen){minlen=right-left+1;}
            right++;len++;
        }
        return minlen;
    }
}
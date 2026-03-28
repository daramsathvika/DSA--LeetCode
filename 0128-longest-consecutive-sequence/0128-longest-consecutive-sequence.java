class Solution {
    public int longestConsecutive(int[] nums) {
        int i,n=nums.length,sum=0,len=0,max_len=1;
        if(n==0){return 0;}
        HashSet<Integer> set = new HashSet<>();
        //map.add(0,-1);
        for(i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int k:set){
            while(set.contains(k)){len=len+1;
                if(len>max_len){max_len=len;}
                k++;
            }
            len=0;
        }
        return max_len;
    }
}
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length,min=0,max=0,ans=0;
        for(int i:weights){
            max+=i;
            min=Math.max(i,min);
        }
        if (days==1){return max;}
        while(min<=max){
            int mid=(min+max)/2,sum=0,time=0;
            for(int i=0;i<n;i++){
                //if(weights[i]>mid){break;}
                if(sum+weights[i]>mid){time++;sum=0;i--;continue;}
                else{sum+=weights[i];}
                if(time>days){break;}
            }
            if(time>=days){min=mid+1;}
            else{ans=mid;max=mid-1;}
        }
        return ans;
    }
}
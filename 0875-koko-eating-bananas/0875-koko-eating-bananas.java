class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i,n=piles.length,min=1,max=Integer.MIN_VALUE,mid=0,ans=0;
        long sum=0;
        for(i=0;i<n;i++){
            sum+=piles[i];
            max=Math.max(max,piles[i]);
        }
        if(sum<=h){return 1;}
        else if(h==n){return max;} 
        while(min<=max){
            sum=0;
            mid=(min+max)/2;
            for(i=0;i<n;i++){
                sum+=1+(piles[i]-1)/mid;
                if(sum>h){break;}
            }
            if(sum<=h){ans=mid;max=mid-1;}
            else{min=mid+1;}
        }
        System.out.println(sum);
        return ans;
    }
}
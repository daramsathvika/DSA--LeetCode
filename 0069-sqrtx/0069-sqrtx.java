class Solution {
    public int mySqrt(int x) {
        long left=0,right=x,mid=(left+right)/2,res=x-mid*mid;
        if(x==0||x==1){return x;}
        HashSet<Long> set = new HashSet<>();
        set.add(mid);
        while(mid>=0&&right<=x){
            if(res==0){return (int)mid;}
            else if(res>0){
                left=mid;
                mid=left+(right-left)/2;
                res=x-mid*mid;}
            else{
                right=mid;
                mid=left+(right-left)/2;
                res=x-mid*mid;}
                if(set.contains(mid)){return (int)mid;}
                else{set.add(mid);}
        }
        return (int)mid;
    }
}
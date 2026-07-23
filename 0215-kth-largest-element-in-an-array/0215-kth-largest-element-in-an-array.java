class Solution {
    int n;
    public int findKthLargest(int[] nums, int k) {
        int i;this.n=nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int p:nums){list.add(p);}
        maxheap(list);i=0;
        while(i<k-1){
            System.out.println(list.get(0));
            removeheap(list);i++;
        }
        return list.get(0);
    }
    public void maxheap(ArrayList<Integer> nums){
        int i,n=nums.size();
        for(i=n/2-1;i>=0;i--){
            downheap(nums,i);
        }
    }
    public void removeheap(ArrayList<Integer> list){
        list.set(0,list.get(list.size()-1));
        list.remove(list.size()-1);
        downheap(list,0);
    }
    public void downheap(ArrayList<Integer> nums,int i){
        int size=nums.size(),left=childleft(i,size),right=childright(i,size);
        if(size==1){return;}
        if(left>0&&right>0){
            //System.out.println(left+" "+right+" "+i+" ");
            if(nums.get(i)<nums.get(left)||nums.get(i)<nums.get(right)){
                int k=nums.get(left)>nums.get(right) ? left :right;
                swap(k,i,nums);downheap(nums,k);
            }
        }
        else if(left>0&&nums.get(i)<nums.get(left)){swap(left,i,nums);}
        else if(right>0&&nums.get(i)<nums.get(right)){swap(right,i,nums);}
    }
    public int childleft(int i,int n){return 2*i+1>=n ? -1 : 2*i+1;}
    public int childright(int i,int n){return 2*(i+1)>=n ? -1: 2*(i+1);}
    public int parent(int i){return (i-1)/2<0 ? -1: (i-1)/2;}
    public void swap(int a, int b,ArrayList<Integer> nums){
        int temp=nums.get(a);
        nums.set(a,nums.get(b));
        nums.set(b,temp);
    }
}
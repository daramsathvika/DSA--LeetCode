class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length,left=0,right=n-1,mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(left==right){break;}
            if(arr[mid+1]>arr[mid]){left=mid+1;}
            else{right=mid;}
        }
        return mid;
    }
}
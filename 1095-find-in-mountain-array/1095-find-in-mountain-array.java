/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left=0,n=mountainArr.length(),right=n-1,mid=0,peak=0;
        while(left<=right){
            mid=(left+right)/2;
            if(left==right){peak=mid;break;}
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){left=mid+1;}
            else{right=mid;}
        }
        left=0;right=peak;
        while(left<=right){
            mid=(left+right)/2;
            if(mountainArr.get(mid)==target){return mid;}
            if(mountainArr.get(mid)<target){left=mid+1;}
            else{right=mid-1;}
        }
        left=peak;right=n-1;
        while(left<=right){
            mid=(left+right)/2;
            if(mountainArr.get(mid)==target){return mid;}
            if(mountainArr.get(mid)<target){right=mid-1;}
            else{left=mid+1;}
        }
        return -1;
    }
}
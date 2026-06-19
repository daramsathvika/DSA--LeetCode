class Solution {
    public int largestAltitude(int[] gain) {
        int i=0,n=gain.length,max=0;
        int arr[]=new int[n+1];arr[0]=0;
        for(i=1;i<=n;i++){
            arr[i]=gain[i-1]+arr[i-1];
            if(max<arr[i]){System.out.println(arr[i]);max=arr[i];}
        }
        return max;
    }
}
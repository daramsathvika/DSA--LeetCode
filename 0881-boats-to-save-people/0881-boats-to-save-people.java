class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i,n=people.length;
        Arrays.sort(people);
        int left=0,right=n-1,count=n;
        while(left<right&&right<n){
            if(people[left]+people[right]<=limit){count--;left++;right--;}
            else{right--;}
        }
        return count;
    }
}
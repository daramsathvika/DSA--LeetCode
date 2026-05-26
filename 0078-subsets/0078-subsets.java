class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        sets(list,0,nums,set);
        return set;
    }
    public static void sets(List<Integer> list,int i,int arr[],List<List<Integer>> set){
        if(i>=arr.length){
        List<Integer> listtt = new ArrayList<Integer>(list);set.add(listtt);}
        else{
            list.add(arr[i]);
            sets(list,i+1,arr,set);
            list.remove(Integer.valueOf(arr[i]));
            sets(list,i+1,arr,set);
        }
    }
}
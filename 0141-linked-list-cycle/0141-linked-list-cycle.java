/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){return false;}
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp=head;//set.add(head);
        while(temp!=null){
            if(set.contains(temp)){break;}
            set.add(temp);System.out.print(temp.val);
            temp=temp.next;
        }
        //System.out.print(temp.val);
        return !(temp==null);
    }
}
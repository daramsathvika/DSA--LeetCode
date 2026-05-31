/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){return head;}
        ListNode left=head;
        ListNode right=head.next;
        ListNode newhead=right;
        boolean previ=false;
        ListNode prev=right;
        while(right!=null&&left!=null){
            ListNode temp=right.next;
            if(previ){prev.next=right;}
            right.next=left;
            left.next=temp;
            System.out.println(right.val+" "+left.val);
            if(temp==null||temp.next==null){break;}
            prev=left;previ=true;
            left=temp;
            right=temp.next;
        }
    return newhead;
    }
}
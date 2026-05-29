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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){return head;}
        ListNode curr=head;
        ListNode tail=head.next;
        while(tail.next!=null){
            if(head.val==tail.val){
                while(head.val==tail.val&&tail.next!=null){tail=tail.next;}
                head.next=tail;
            }
            else{
                head=head.next;tail=tail.next;
            }
        }
        if(head.val==tail.val){head.next=null;}
        return curr;
    }
}
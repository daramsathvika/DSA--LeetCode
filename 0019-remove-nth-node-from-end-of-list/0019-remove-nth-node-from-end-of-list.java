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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){return head;}
        int size=0,i=0;
        ListNode newhead=head;
        ListNode curr=head;
        while(curr!=null){curr=curr.next;size++;}
        curr=head;
        if(size==n){return head.next;}
        ListNode prev=curr;
        while(i<size-n){
            prev=curr;
            if(curr==null){break;}
            curr=curr.next;
            i++;
        }
        if(curr==null){return null;}
        prev.next=prev.next.next;
        return newhead;
    }
}
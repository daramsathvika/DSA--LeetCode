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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast.next!=null){
            slow=slow.next;fast=fast.next.next;
        }
        ListNode list2tail=slow.next;
        slow.next=null;fast=list2tail;
        ListNode prev=null;ListNode curr=list2tail;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        //System.out.println(prev.next.val);
        slow=head;int maxsum=0;
        while(prev!=null&&slow!=null){
            maxsum=Math.max(maxsum,prev.val+slow.val);
            prev=prev.next;slow=slow.next;
        }
        return maxsum;
    }
}
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right||head==null){return head;}
        int pos=1;
        ListNode prev=head;
        ListNode curr=head;
        if(left==1){
            prev=new ListNode(0,head);
        }
        else{
            while(pos!=left){
            prev=curr;
            curr=curr.next;pos++;
            }
        }
        
        System.out.println(curr.val+" "+prev.val);
        ListNode nekest=curr;
        while(pos!=right+1){
            nekest=nekest.next;pos++;
        }
        //System.out.println(nekest.val);
        ListNode pre=null;
        ListNode temp=null;
        ListNode start=curr;
        while(start!=nekest){
            temp=start.next;
            start.next=pre;
            pre=start;
            start=temp;
            //System.out.println(start.val+" "+pre.val);
        }
        //System.out.println(start.val+" "+pre.val+" "+prev.val+" "+curr.val);
        
        prev.next=pre;
        curr.next=nekest;
        if(left==1){return prev.next;}
        return head;
    }
}
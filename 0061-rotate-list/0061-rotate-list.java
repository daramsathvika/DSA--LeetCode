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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){return head;}
        ListNode tail=head;
        int size=1;
        while(tail.next!=null){
            tail=tail.next;size++;
        }
        tail.next=head;
        //System.out.println(size);
        int i=size-k%size;
        while(i>0){
            tail=head;head=head.next;i--;
            //System.out.println(head.val);
            }
            tail.next=null;
        return head;
    }
}
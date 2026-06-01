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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){return head;}
        ListNode dummy = new ListNode(0,head);
        ListNode node= dummy;
        boolean istrue =false;
        while(!(node.next.next==null)){
            istrue=false;
            if(node.next.val==val){node.next=node.next.next;istrue=true;}
            //System.out.println(node.val);
            if(!istrue){node=node.next;}
            if(node==null){break;}
        }
        if(node.next.val==val){node.next=null;}
        return dummy.next;
    }
}
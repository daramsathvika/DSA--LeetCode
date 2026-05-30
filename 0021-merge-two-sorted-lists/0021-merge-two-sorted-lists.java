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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){return list2;}
        if(list2==null){return list1;}
        ListNode curr1=list1;
        ListNode curr2=list2;
        ListNode list;
        ListNode head;
        if(list1.val>list2.val){list=curr2;head=list;curr2=curr2.next;}
        else{list=curr1;head=list;curr1=curr1.next;}
        while(curr1!=null||curr2!=null){
            if(curr1==null){list.next=curr2;break;}
            else if(curr2==null){list.next=curr1;break;}
            if(curr2.val>curr1.val){
                //ListNode temp=curr2;
                list.next=curr1;
                curr1=curr1.next;
                list=list.next;
            }  
            else{
                list.next=curr2;
                curr2=curr2.next;
                list=list.next;
            }          
        }
        return head;
    }
}
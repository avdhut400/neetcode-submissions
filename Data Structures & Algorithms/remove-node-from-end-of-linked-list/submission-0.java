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
        
        ListNode list=new ListNode(0);
        list.next=head;
        ListNode fast=list;
        ListNode slow=list;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){ 
            slow=slow.next;
            fast=fast.next;
        }
        if(slow.next!=null){
            slow.next=slow.next.next;
        }
        return list.next;
    }
}
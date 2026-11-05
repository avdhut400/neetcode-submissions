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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null|| lists.length==0 ) return null;
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode n:lists){
            if(n!=null){
                  pq.add(n);
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(!pq.isEmpty()){
            ListNode s=pq.poll();
            temp.next=s;
            temp=temp.next;
            if(s.next!=null){
                pq.add(s.next);
            }
        }
        return dummy.next;

    }
}

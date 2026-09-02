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
        ListNode first = head;
        ListNode second = head;
        ListNode last = head;
        if(head.next==null){
            return null;
        }
        for(int i = 1; i<n; i++){
            last = last.next;
        }
        
        while(last.next!=null){
            last = last.next;
            first = second;
            second = second.next;
        }
        if(first==second){
            return first.next;
        }
        if(second==null){
            return null;
        }
        first.next = second.next;
        return head;
    }
}

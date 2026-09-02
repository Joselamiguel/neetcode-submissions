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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverseHead = slow.next;
        ListNode prev = null;
        slow.next = null;
        while(reverseHead!=null){
            ListNode temp = reverseHead.next;
            reverseHead.next = prev;
            prev = reverseHead;
            reverseHead = temp;
        }
        ListNode second = prev;
        ListNode fullNode = head;
        while(second!=null){
            ListNode tmp1 = fullNode.next;
            ListNode tmp2 = second.next;
            fullNode.next = second;
            second.next = tmp1;
            second = tmp2;
            fullNode = tmp1; 
        }
    }
}

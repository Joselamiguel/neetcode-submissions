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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = l1;
        ListNode result = output;
        ListNode prev = null;
        while(output!=null && l2!=null){
            output.val = output.val + l2.val;
            if(output.val>=10){
                int remain = output.val/10;
                output.val = output.val%10;
                
                if(output.next == null){
                    output.next = new ListNode(remain);
                } else{
                    output.next.val += remain;
                }
            }
            prev = output;
            output = output.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l2 != null) {
            prev.next = l2; 
            output = l2; 
        }
        while(output!=null){
            if(output.val>=10){
                int remain = output.val/10;
                output.val = output.val%10;
                
                if(output.next == null){
                    output.next = new ListNode(remain);
                } else{
                    output.next.val += remain;
                }
            }
            output = output.next;
        
        }
        return result;
    }
}

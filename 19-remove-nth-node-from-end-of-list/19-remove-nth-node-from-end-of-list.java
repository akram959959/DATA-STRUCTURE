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
        
        int l = 0;
        ListNode current = head;
        while(current!=null){
            l++;
            current = current.next;
        }
        current = head;
        if(l == n && current.next == null){
            return null;
        }
        if(l == n && current.next != null){
        return current.next;
    }
        n = l-n+1;
        int p = 0;
    
        while(current!=null){
            p++;
        
            if(p == n-1){
              current.next = current.next.next;
            }
            else{
              current = current.next;
            }
       
        }
        return head;
    }
    
}
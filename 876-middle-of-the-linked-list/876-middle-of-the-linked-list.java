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
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> a = new ArrayList<>();
        int k= 0;
        
        while(head != null){
            a.add(head);
            head = head.next;
            k++;
        }
        return a.get(k/2);
    }
}
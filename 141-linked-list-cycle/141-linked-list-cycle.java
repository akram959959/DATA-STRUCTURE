/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       /* ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }
        return false;*/
        Set<ListNode> visited = new HashSet<>();
      while (head!=null){
          if(visited.contains(head)) return true;
          visited.add(head);
          head = head.next;}
      return false;
        
        
    }
}

/*def hasCycle(self, ihead: Optional[ListNode]) -> bool:
        t_dict = dict()
        while ihead:
            if t_dict.get(ihead, False):
                return True
            t_dict[ihead] = True
            ihead = ihead.next
        return False
        
        */
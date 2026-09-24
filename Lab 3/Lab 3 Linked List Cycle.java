
 /* Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      
    ListNode(int x) {
          this.val = x;
          this.next = null;
    }
  }
 */
 
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode leo = head, bugs = head;

        while (leo != null && bugs != null && bugs.next != null) {
            
            leo = leo.next;
            bugs = bugs.next.next;

            if (leo == bugs)
                return true;            
        }
        return false;
    }
}

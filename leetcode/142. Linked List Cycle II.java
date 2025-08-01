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
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean checkCycle=false;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                checkCycle=true;
                break;
            }
        }
            
            if(!checkCycle){return null;}
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
        
        return slow;
    }
}
// Once we detect the cycle we should set the slow to head again and then increment both slower head by the point where they both meet will be the tail of circular Linked List

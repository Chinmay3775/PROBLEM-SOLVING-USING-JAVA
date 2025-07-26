/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //===================================Time and space Optimal method====================================

 public class Solution {
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);

        while(lenA>lenB){
            lenA--;
            headA=headA.next;
        }
        while(lenB>lenA){
            lenB--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    public int getListLength(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}

//=================================Time Optimal method=================================================
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         HashSet<ListNode> address = new HashSet<>();
//         ListNode a=headA;
//         while(a!=null){
//             address.add(a);
//             a=a.next;
//         }
//         ListNode b= headB;
//         while(b!=null){
//             if(address.contains(b)) return b;
//             else b=b.next;
//         }
//         return null;
//     }
// }


// =====================================Brute-Force-Method============================================
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode a=headA;
//         while(a!=null ){
//             ListNode b=headB;
//             while(b!=null){
//                 if(a==b) return a;
//                 else b=b.next;
//             }
//             a=a.next;
//         }
//         return null;
//     }
// }
/* In total there are three methods to solve this problem 1st is brute force method 2nd is time optimal and then time and space optimal 
In brute force method we use while loops and then check if both the notes have the same next addresses and if both have same then we return anyone of it  
In case we use a hash set to check if there are duplicate addresses and if there are duplicate addresses present will return the duplicate ones 
3rd is to check the length of the both lists and taking out the difference and starting both the notes at same point and checking if both are seen and then returning either of it
*/

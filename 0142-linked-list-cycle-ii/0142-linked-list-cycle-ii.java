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
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         HashMap<String,Integer> hm = new HashMap<>();
//         while( head != null && head.next != null){
//             System.out.println(head);
//             if(hm.getOrDefault(head+"",0) != 0){
//                 return head;
//             }else{
//                 hm.put(head+"",1);
//             }
//             head= head.next;
//         }
//         return null;
//     }
// }
// optimal approach
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
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
        HashMap<String,Integer> hm = new HashMap<>();
        while( head != null && head.next != null){
            System.out.println(head);
            if(hm.getOrDefault(String.valueOf(head),0) != 0){
                return head;
            }else{
                hm.put(String.valueOf(head),1);
            }
            head= head.next;
        }
        return null;
    }
}
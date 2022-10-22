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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode temp = new ListNode(head.val);
        head = head.next;
        ListNode temp2;
        while(head != null){
            temp2 = new ListNode(head.val);
            temp2.next = temp;
            temp = temp2;
            head = head.next;
        }
        return temp;
    }
}
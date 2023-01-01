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

    public ListNode addTwoNumbers(ListNode reverseList1, ListNode reverseList2) {
        ListNode resultList = null;
        int carryForward = 0;
        while (reverseList1 != null && reverseList2 != null) {
            int sum = (reverseList1.val + reverseList2.val) + carryForward;
            carryForward = sum / 10;
            if (resultList == null) {
                resultList = new ListNode(sum % 10);
            } else {
                resultList = new ListNode(sum % 10, resultList);
            }
            reverseList1 = reverseList1.next;
            reverseList2 = reverseList2.next;
        }

        while (reverseList1 != null) {
            int sum = reverseList1.val + carryForward;
            carryForward = sum / 10;
            resultList = new ListNode(sum % 10, resultList);
            reverseList1 = reverseList1.next;
        }

        while (reverseList2 != null) {
            int sum = reverseList2.val + carryForward;
            carryForward = sum / 10;
            resultList = new ListNode(sum % 10, resultList);
            reverseList2 = reverseList2.next;
        }

        if (carryForward != 0) {
            resultList = new ListNode(carryForward, resultList);
        }

        return reversListNodes(resultList);
    }

    public ListNode reversListNodes(ListNode listNode) {
        ListNode prevNode = listNode;
        ListNode currNode = listNode.next;
        prevNode.next = null;
        while (currNode != null) {
            ListNode tempNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = tempNode;
        }
        return prevNode;
    }
}

package leetcode;

import nodes.ListNode;

public interface AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode nodeOne = l1, nodeTwo = l2, currentNode = result;
        int tensKeeper = 0;

        while (nodeOne != null || nodeTwo != null) {
            int nodeOneValue = (nodeOne == null) ? 0 : nodeOne.val;
            int nodeTwoValue = (nodeTwo == null) ? 0 : nodeTwo.val;

            int sum = nodeOneValue + nodeTwoValue + tensKeeper;
            tensKeeper = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            if (nodeOne != null) {
                nodeOne = nodeOne.next;
            }
            if (nodeTwo != null) {
                nodeTwo = nodeTwo.next;
            }
        }
        if (tensKeeper > 0) {
            currentNode.next = new ListNode(tensKeeper);
        }
        return result.next;
    }
}

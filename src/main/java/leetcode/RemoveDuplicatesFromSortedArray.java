package leetcode;

import nodes.ListNode;

public interface RemoveDuplicatesFromSortedArray {
    static ListNode deleteDuplicates(ListNode head) {
        ListNode firstNode = head;
        if (firstNode == null) return null;
        if (firstNode.next == null) return firstNode;

        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return firstNode;
    }
}

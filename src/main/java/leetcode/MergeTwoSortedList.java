package leetcode;

import model.ListNode;

public interface MergeTwoSortedList {
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode nextNode1 = list1.next;
        ListNode nextNode2 = list2.next;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(nextNode1, list2);
            return list1;
        }
        list2.next = mergeTwoLists(list1, nextNode2);
        return list2;
    }
}

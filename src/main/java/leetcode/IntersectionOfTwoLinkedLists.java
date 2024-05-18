package leetcode;

import model.ListNode;

public interface IntersectionOfTwoLinkedLists {
    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode frst = headA;
        ListNode scnd = headB;
        while (frst != scnd) {
            if (frst == null) {
                frst = headB;
            } else {
                frst = frst.next;
            }
            if (scnd == null) {
                scnd = headA;
            } else {
                scnd = scnd.next;
            }
        }
        return frst;
    }
}

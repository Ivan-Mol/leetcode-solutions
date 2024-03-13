import leetcode.ReverseLinkedList;
import model.ListNode;

public class Main {
    public static void main(String[] args) {
        System.out.println(ReverseLinkedList.reverseList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))))));
    }
}
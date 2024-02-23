import leetcode.RemoveDuplicatesFromSortedArray;
import leetcode.Sqrt;
import model.ListNode;

public class Main {


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,new ListNode(1,new ListNode(3)));
        System.out.println(RemoveDuplicatesFromSortedArray.deleteDuplicates(listNode).toString());    }
}
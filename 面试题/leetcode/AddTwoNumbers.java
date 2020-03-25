package 面试题.bs.leetcode;

class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }

}
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n1 = l1.val;
        int n2 = l2.val;
        int digit = 1;
        while (l1.next != null) {
            n1 += l1.next.val * digit;
            n2 += l2.next.val * digit;
            digit *= 10;
        }
        String sumResults = String.valueOf(n1 + n2);
        ListNode result = new ListNode (sumResults.charAt(sumResults.length()));
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next.val = 4;
        l1.next.val = 3;
        ListNode l2 = new ListNode(5);
        l1.next.val = 6;
        l1.next.val = 4;

    }

}

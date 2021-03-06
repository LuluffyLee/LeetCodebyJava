//LeetCode
//21. Merge Two Sorted Lists
import java.util.*;

public class Solution21{
	//Sublime Run
	public static void main(String[] args)
	{
		ListNode l1=new ListNode(0);
		ListNode l2=new ListNode(1);
		System.out.println(mergeTwoLists(l1,l2).next.val);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode result = new ListNode(0);
        ListNode prev = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if (l1 != null) {
            prev.next = l1;
        }
        if (l2 != null) {
            prev.next = l2;
        }
        return result.next;
    }
}
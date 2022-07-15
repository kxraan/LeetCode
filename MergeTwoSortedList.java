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
    ListNode head;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
head = list1;
if(list1==null&&list2==null){
    return null;
}else if(head==null){
    return list2;
}else if(list2==null){
    return head;
} else{
		ListNode curr1 = head;
		//ListNode next1 = head.next;

		ListNode curr2 = list2;

		while (curr2 != null) {
			if (curr2.val < head.val) {
				head = new ListNode(curr2.val);
				head.next = curr1;
				curr1 = head;
                curr2= curr2.next;
			//	next1 = head.next;
			}

			else if (curr2.val >= curr1.val && curr2.val <= (curr1.next==null?101:curr1.next.val)) {
				ListNode node = new ListNode(curr2.val);

				ListNode temp = curr1;
				node.next = temp.next;

				curr1.next = node;
				curr2 = curr2.next;
				
				curr1 = curr1.next;
				//next1 = curr1.next;
				
			} else {
				curr1 = curr1.next;
				//next1 = next1.next;

			}

		}

		return head;

    }}
}

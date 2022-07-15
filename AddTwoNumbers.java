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
	ListNode head,tail;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode curr1 = l1;
		ListNode curr2 = l2;
		ListNode curr = head;

		while (curr1 != null || curr2 != null) {

			int sum = (curr1 == null ? 0 : curr1.val) + (curr2 == null ? 0 : curr2.val);

            boolean flag=true;
			if (sum % 10 == sum) {

				curr = new ListNode(sum);
				if (tail == null) {
					curr.next = tail;
					tail = curr;
					head = tail;
				} else {
					tail.next = curr;
					tail = curr;
				}


			} else {
				while (sum > 0) {
					curr = new ListNode(sum % 10);
					if (tail == null) {
						curr.next = tail;
						tail = curr;
						head = tail;
					} else {
						tail.next = curr;
						tail = curr;
					}
					
					
					curr1 = (curr1 == null ? null : curr1.next);
					curr2 = (curr2 == null ? null : curr2.next);
					sum = sum / 10 + (curr1 == null ? 0 : curr1.val) + (curr2 == null ? 0 : curr2.val);

                    flag=false;
					curr = curr.next;
				}
			}
			
			if(flag) {
			curr1 = (curr1 == null ? null : curr1.next);
			curr2 = (curr2 == null ? null : curr2.next);
			curr = (curr == null ? null : curr.next);
			}
		}
		return head;
	}
    
}

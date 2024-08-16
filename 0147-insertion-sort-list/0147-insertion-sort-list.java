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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = head;
        while(temp != null){
            ListNode t1 = temp.next;
            while(t1 != null){
                if(temp.val > t1.val){
                    int t = temp.val;
                    temp.val = t1.val;
                    t1.val = t;
                }
                t1 = t1.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
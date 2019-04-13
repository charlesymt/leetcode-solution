/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode heard = new ListNode(0);
        ListNode curr = heard;
        int a = 0;
        while(l1 != null || l2 != null){
            int v = 0;
            if(null != l1){
                v += l1.val;
                l1 = l1.next;
            }
            if(null != l2){
                v += l2.val;
                l2 = l2.next;
            }
            v+=a;
            curr = curr.next = new ListNode(v%10);
            a = v/10;
        }
        if (0 != a){
            curr.next = new ListNode(a);
        }
        return heard.next;
    }
}
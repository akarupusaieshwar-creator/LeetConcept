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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return head;
        int rig = left;
        ListNode l = head;
        ListNode r = head;
        ListNode ll = head;
        while(l != null && left != 1) {
            ll = l;
            l = l.next;
            left--;
        } 
        ListNode rr = head;
        while(r != null && right != 1){
            r = r.next;
            right--;
        }
        rr = r.next;
        r.next = null;

        ListNode h1 = reverse(l);
        if(rig > 1){
            ll.next = h1;
            
        }else{
            head = h1;
            
        }
        l.next = rr;
        return head;
    }
    public ListNode reverse(ListNode h){
        if(h == null || h.next == null) return h;
        ListNode h1 = reverse(h.next);
        h.next.next = h;
        return h1;
    }
}
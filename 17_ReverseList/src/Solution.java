
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode new_head = null;
        ListNode cur = head;
        ListNode next = null;

        while(cur != null){
            next = cur.next;
            cur.next = new_head;
            new_head = cur;
            cur = next;
        }
        return new_head;
    }
}



class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
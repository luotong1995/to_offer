
public class Solution {
    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode new_head = null;
        ListNode next1 = null;
        ListNode next2 = null;

        ListNode r = null;
        while (cur1 != null && cur2 != null) {
            next1 = cur1.next;
            next2 = cur2.next;
            if (cur1.val < cur2.val) {
                if (new_head == null) {
                    r = cur1;
                    new_head = cur1;
                } else {
                    r = insertNode(r, cur1);
                }
                cur1 = next1;
            } else if (cur1.val > cur2.val) {
                if (new_head == null) {
                    r = cur2;
                    new_head = cur2;
                } else {
                    r = insertNode(r, cur2);
                }
                cur2 = next2;
            } else {
                if (new_head == null) {
                    r = cur1;
                    new_head = cur1;
                }else{
                    r = insertNode(r, cur1);
                }
                cur1 = next1;
                r = insertNode(r, cur2);
                cur2 = next2;
            }
        }
        if (cur1 == null && cur2 != null) {
            if (new_head == null) {
                r = cur2;
                new_head = cur2;
            }else{
                r = insertNode(r, cur2);
            }
            cur2 = next2;
        }

        if (cur2 == null && cur1 != null) {
            if (new_head == null) {
                r = cur1;
                new_head = cur1;
            }else{
                r = insertNode(r, cur1);
            }
            cur1 = next1;
        }
        return new_head;
    }

    public static ListNode insertNode(ListNode r, ListNode node) {
        r.next = node;
        r = node;
        return r;
    }


    public static void main(String[] args) {
        ListNode head1 = null;
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        ListNode r = null;
        for (int i = 0; i < a.length; i++) {
            ListNode node = new ListNode(a[i]);
            if (head1 == null) {
                head1 = node;
                r = node;
            } else {
                r.next = node;
                r = node;
            }
        }
        r.next = null;


        ListNode head2 = null;
        int b[] = {0, 1, 2, 3, 4, 5, 7, 8, 12};
        r = null;
        for (int i = 0; i < b.length; i++) {
            ListNode node = new ListNode(b[i]);
            if (head2 == null) {
                head2 = node;
                r = node;
            } else {
                r.next = node;
                r = node;
            }
        }
        r.next = null;
        ListNode result = Merge(head1, head2);

        System.out.println();
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
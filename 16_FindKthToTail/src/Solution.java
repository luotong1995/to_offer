public class Solution {
    public static ListNode FindKthToTail(ListNode head, int k) {
        int length = 0;
        ListNode cur = head;
        while(cur != null){
            length ++;
            cur = cur.next;
        }

        int index = length - k;
        if(length < k){
            return null;
        }

        int count = 0;
        cur = head;
        while(true){
            if(count == index){
                return cur;
            }
            count ++;
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = null;
        int a[] ={1,2,3,4,5,6,7};
        ListNode r = null;
        for(int i=0;i < a.length; i++){
            ListNode node = new ListNode(a[i]);
            if(head == null){
                head = node;
                r = node;
            }else{
                r.next = node;
                r = node;
            }
        }
        r.next = null;

        ListNode result = FindKthToTail(head,4);
        System.out.println(result.val);

    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
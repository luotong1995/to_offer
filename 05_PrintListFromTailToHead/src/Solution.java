
import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode cur = listNode;
        while(cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println();
        int a[] = {1,2,3,45};
        ListNode head = null;
        ListNode r = null;
        for(int i = 0; i < a.length; i++){
            ListNode temp = new ListNode(a[i]);
            if(head == null){
                 head = temp;
                 r = temp;
            }else{
                r.next = temp;
                r = temp;
            }
        }
        r.next = null;
        ArrayList<Integer> list = printListFromTailToHead(head);
        System.out.println(list);
    }

}


class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
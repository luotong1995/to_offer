import java.util.Stack;

public class Solution {
    public static Stack<Integer> stack1 = new Stack<Integer>();
    public static Stack<Integer> stack2 = new Stack<Integer>();

    // stack1 is in
    // stack2 is out
    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }else{
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        push(11);
        System.out.println(pop());
        push(12);
        push(1);

        push(133333);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());



    }
}
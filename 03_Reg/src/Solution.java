import java.util.Stack;

public class Solution {
    public static  boolean match(char[] str, char[] pattern)
    {
        Stack<Character> stack = new Stack<>();
        for (char item :pattern){
            stack.push(item);
        }
        char vip  = ' ';
        int vip_flag = 0;
        int is_in_flag = 0;
        for (int i = str.length -1; i >=0; i--){
            char c = stack.pop();
            if(c == '.'){

            }else if(c == '*'){
                vip = stack.pop();
                vip_flag = 1;
            }
            if(vip_flag == 1){
                if(str[i] == vip){
                    is_in_flag = 1;
                }else if(str[i] != vip) {
                    if (is_in_flag == 1){
                        vip_flag = 0;
                        if(stack.peek() != vip) {
                            char c_ = stack.pop();
                            if (c_ != '.') {
                                return false;
                            }
                        }
                    }else {

                    }

                }
            }else if(c != str[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        char str[] = {'a','a','a'};
//        char pattern[] = {'a','.','a'};
        char pattern[] = {'a','b','*','a','c','*','a'};
        System.out.println(match(str,pattern));
    }

}

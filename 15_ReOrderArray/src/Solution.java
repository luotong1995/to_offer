import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public static void reOrderArray(int [] array) {
        LinkedList<Integer> queue1 = new LinkedList<>();
        LinkedList<Integer> queue2 = new LinkedList<>();

        for(int i =0 ;i < array.length;i++){
            if((array[i] & 1) == 1){
                queue1.add(array[i]);
            }else{
                queue2.add(array[i]);
            }
        }
        int i = 0;
        while(!queue1.isEmpty()){
            array[i++] = queue1.pollFirst();
        }
        while(!queue2.isEmpty()){
            array[i++] = queue2.pollFirst();
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,1,3,2,21,245,23,8};
        for(int i = 0; i < a.length;i++){
            System.out.println(a[i]);

        }
        reOrderArray(a);
        for(int i = 0; i < a.length;i++){
            System.out.println(a[i]);

        }
    }
}
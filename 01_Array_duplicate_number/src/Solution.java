import java.util.HashMap;

public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        duplication[0] = -1;
        if (length == 0){
            return false;
        }
        HashMap<Integer,Integer> map  = new HashMap<>();
        for (int item :numbers){
            if (map.containsKey(item)){
                duplication[0] = item;
                return true;
            }else {
                map.put(item,1);
            }
        }
        return false;
    }
}

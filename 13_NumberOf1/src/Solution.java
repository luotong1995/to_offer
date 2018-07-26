public class Solution {
    public static int NumberOf1(int n) {
        String strs= Integer.toBinaryString(n);
        return strs.replaceAll("0","").length();
    }




    private static int NumberOf1_low(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
            }
    return count;
    }



    public int NumberOf13(int n) {
        int count = 0;

        while(n!= 0){
            count++;
            //一直与自己小的数进行&运算，可以将最右边的1去掉，如此迭代，知道没有1
            n = n & (n - 1);
        }
        return count;
    }

    public static int NumberOf14(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        System.out.println(NumberOf14(5));
    }
}
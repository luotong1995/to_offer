public class Solution {

    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int minNumberInRotateArray2(int[] array) {

        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            } else {
                if (i == array.length - 2) {
                    return array[0];
                }
            }
        }


        return 0;
    }

    public static void main(String[] args) {
        int a[] = {1, 0, 1, 1, 1};
        int min_value = minNumberInRotateArray2(a);
        System.out.println(min_value);
    }
}

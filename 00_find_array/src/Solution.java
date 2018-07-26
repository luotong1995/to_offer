public class Solution {
    public static boolean Find(int target, int [][] array) {
        if(array[0].length == 0){
            return false;
        }
        for(int i=0;i < array.length;i++){
            for(int j=0;j< array.length;j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Find2(int target, int [][] array) {
        if(array[0].length == 0){
            return false;
        }
        int i = array.length - 1;
        int j = 0;
        while(i >= 0 && j < array.length){
            // 先找出target所在的行
            if(array[i][j] > target){
                i --;
            }else if(array[i][j] < target){
                j ++;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int target = 1;

        int [][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
//        int[][] a = {{}};
        System.out.println(Find2(target, a));

    }
}
public class Solution {
    public static int RectCover(int target) {
        if(target ==0 || target == 1 || target == 2){
            return target;
        }
        int nums[] = new int[target+1];
        nums[1] = 1;
        nums[2] = 2;
        for(int i = 3; i <= target; i++){
            nums[i] = nums[i -1] + nums[i - 2];
        }
        return nums[target];
    }

    public static void main(String[] args) {
        System.out.println(RectCover(4));
    }
}
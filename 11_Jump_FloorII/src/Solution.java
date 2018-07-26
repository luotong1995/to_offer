public class Solution {

    public static int JumpFloorII(int target) {
        int nums[] = new int[target + 1];
        if(target == 1 || target == 2){
            return target;
        }
        nums[1] = 1;
        nums[2] = 2;

        for(int i = 3; i <= target;i ++){
            nums[i] = 0;
            for(int j = 1; j < i; j++){
                nums[i] += nums[j];
            }
            nums[i] += 1;
        }

        return nums[target];
    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII(1));
    }
}
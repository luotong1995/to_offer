
//B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]
//从左到右算 B[i]=A[0]*A[1]*...*A[i-1]
//从右到左算B[i]*=A[i+1]*...*A[n-1]
public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];

        int ret = 1;
        for (int i = 0; i < A.length; ret *= A[i++]) {
            B[i] = ret;
        }
        ret = 1;
        for (int i = A.length - 1; i >= 0; ret *= A[i--]) {
            B[i] *= ret;
        }
        return B;
    }
}

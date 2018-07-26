
public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root2 == null || root1 == null){
            return false;
        }


        return false;
    }

    public static boolean is_same(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }else if(root1 != null && root2 != null && root1.val != root2.val){
            return false;
        } else if(root1 == null || root2 == null ) {
            return false;
        }
        boolean l_same = is_same(root1.left, root2.left);
        boolean r_same = is_same(root1.right, root2.right);
        if(l_same && r_same){
            return true;
        }else {
            return false;
        }
    }


    public static int i = 0;

    public static TreeNode createBiTree(int a[])
    {
        TreeNode root;
        if(a[i++] == -1){
            return null;
        }else{
            root = new TreeNode(a[i++]);
            root.left = createBiTree(a);
            root.right = createBiTree(a);
            return root;
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};

    }
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
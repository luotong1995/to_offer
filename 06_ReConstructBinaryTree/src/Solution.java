import java.util.ArrayList;

/**

 */
public class Solution {
    public static  TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        ArrayList<Integer> pre_list = new ArrayList<>();
        ArrayList<Integer> in_list = new ArrayList<>();
        for (int item: pre){
            pre_list.add(item);
        }
        for (int item: in){
            in_list.add(item);
        }
        TreeNode root = resortTree(pre_list, in_list, 0,pre.length-1, 0, in.length -1);
        return root;
    }

    public static TreeNode resortTree(ArrayList<Integer> pre, ArrayList<Integer>  in, int pre_l, int pre_r, int in_l, int in_r){
        if(pre_l > pre_r || in_l > in_r){
            return null;
        }
        int root_value = pre.get(pre_l);
        TreeNode root_node = new TreeNode(root_value);
//        if(pre_l == pre_r || in_l == in_r){
//            TreeNode node = new TreeNode(root_value);
//            node.right = node.left = null;
//            return node;
//        }
        int root_index = in.indexOf(root_value);
        int l_length = root_index - in_l;
        int r_length = in_r - root_index;
        if(l_length  >0 ){
            TreeNode left = resortTree(pre, in, pre_l + 1, pre_l + l_length ,in_l,root_index -1);
            root_node.left = left;
        }

        if (r_length > 0){
            TreeNode right = resortTree(pre, in, pre_l + l_length + 1, pre_r,root_index + 1, in_r);
            root_node.right = right;
        }
        return root_node;
    }

    public static void preOrder(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int []pre = {1,2,3,4,5,6,7};
        int []in = {3,2,4,1,6,5,7};

//        int []pre = {1,2,4,3,5,6};
//        int []in = {4,2,1,5,3,6};

//        int []pre = {1,2,3,4};
//        int []in = {4,3,2,1};
        TreeNode root = reConstructBinaryTree(pre, in);
        preOrder(root);
        System.out.println();
        inOrder(root);
    }
}



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x)
    {
        val = x;
    }
 }
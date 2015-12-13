package leetcode226;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }else{
            TreeNode tmp=root.left;
            root.left=root.right;
            root.right=tmp;
            root.left=invertTree(root.left);
            root.right=invertTree(root.right);
            return root;
        }
    }
}

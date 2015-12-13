package leetcode100;
import leetcode100.TreeNode;
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        else if(p!=null && q!=null && p.val!=q.val){
            return false;
        }
        else if(p!=null && q==null){
            return false;
        }
        else if(p==null && q!=null){
            return false;
        }
        else{
            boolean bLeft=isSameTree(p.left,q.left);
            boolean bRight=isSameTree(p.right,q.right);
            return bLeft&&bRight;
        }
    }
}
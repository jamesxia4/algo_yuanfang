package leetcode104;
import leetcode104.TreeNode;
public class Solution {
	public int maxDepth(TreeNode root){
		int depthLeft=1;
		int depthRight=1;
		
		if(root==null){
			return 0;
		}
		else{
			if(root.left!=null){
				depthLeft=depthLeft+maxDepth(root.left);
			}
			if(root.right!=null){
				depthRight=depthRight+maxDepth(root.right);
			}
			
			if(depthLeft>=depthRight){
				return depthLeft;
			}
			else{
				return depthRight;
			}
		}
	}
	
	public static void main(String[] args) {
		

	}

}

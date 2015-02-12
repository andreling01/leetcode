
public class Solution {  
	public TreeNode buildTree(int[] preorder, int[] inorder) {  
		if(preorder.length<1)  
			return null;  
		return subBuild(preorder,0,preorder.length-1,inorder,0,inorder.length-1);   
	}  

	private TreeNode subBuild(int[] preorder, int prestart, int preend, int[] inorder,  
			int instart, int inend) {  
		int root = preorder[prestart];  
		TreeNode tn = new TreeNode(root);  
		if(prestart==preend) return tn;  
		int index = instart;  
		while(inorder[index]!=root){  
			index++;  
		}  
		int leftlen = index-instart-1;  
		int rightlen = inend-index-1;  
		if(index!=instart){  
			tn.left=subBuild(preorder, prestart+1, leftlen+prestart+1, inorder, instart, index-1);  
		}else {  
			tn.left=null;  
		}  
		if(index!=inend){  
			tn.right = subBuild(preorder, preend-rightlen, preend, inorder, index+1, inend);  
		}else {  
			tn.right = null;  
		}  
		return tn;  
	}  


}


public class Solution {
	public static TreeNode sortedArrayToBST(int[] num) {
		if(num.length == 0)
			return null;
		int mid = num.length / 2;
		TreeNode root = new TreeNode(num[mid]);
		setTree(num,0,mid - 1,root,true);
		setTree(num,mid + 1,num.length - 1,root,false);
		return root;
	}
	
	private static void setTree(int[] num, int left, int right, TreeNode parent,boolean leftNode){
		if(left > right)
			return;
		int temp;
		int mid = (left + right) /2;
		temp = num[mid];
		if(leftNode){
			parent.left = new TreeNode(temp);
			setTree(num,left,mid - 1,parent.left,true);
			setTree(num,mid + 1,right,parent.left,false);
		}
		else{
			parent.right = new TreeNode(temp);
			setTree(num,left,mid - 1, parent.right,true);
			setTree(num,mid + 1,right, parent.right,false);
		}
		
	}
	
	public static void main (String[] args){
		int A[] = {1,2,3,4,5,6,7};
		sortedArrayToBST(A);
	}
}

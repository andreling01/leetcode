import java.util.*;
public class Solution {
	public int sumNumbers(TreeNode root) {
		if(root == null)
			return 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		getNumber(root,list,0);
		int sum = 0;
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()){
			sum += iter.next();
		}
		return sum;
	}
	
	private void getNumber(TreeNode root, ArrayList<Integer> list,int lastNumber){
		if(root.left == null && root.right == null)
			list.add(lastNumber * 10 + root.val);
		else if(root.left == null)
			getNumber(root.right,list,lastNumber * 10 + root.val);
		else if(root.right == null)
			getNumber(root.left,list,lastNumber * 10 + root.val);
		else{
			getNumber(root.right,list,lastNumber * 10 + root.val);
			getNumber(root.left,list,lastNumber * 10 + root.val);
		}
	}
}



import java.util.*;
public class Solution {
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		if(root == null)
			return new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		pathSumHelp(result,new ArrayList<Integer>(),root,0,sum);
		return result;
	}

	public void pathSumHelp(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> path,
			TreeNode root, int lastsum, int sum){
		ArrayList<Integer> newpath = new ArrayList<Integer>(path);
		newpath.add(root.val);
		if(root.left == null && root.right == null){
			if(lastsum + root.val == sum)
				result.add(newpath);
		}
		else if(root.left == null)
			pathSumHelp(result,newpath,root.right,lastsum + root.val,sum);
		else if(root.right == null)
			pathSumHelp(result,newpath,root.left,lastsum + root.val,sum);
		else{
			pathSumHelp(result,newpath,root.left,lastsum + root.val,sum);
			pathSumHelp(result,newpath,root.right,lastsum + root.val,sum);
		}
	}
}

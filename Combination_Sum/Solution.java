import java.util.*;
public class Solution {
	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
		if(candidates == null || candidates.length == 0)
			return new ArrayList<ArrayList<Integer>>();
		Arrays.sort(candidates);
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		help(res,new ArrayList<Integer>(),candidates,0,target);
		return res;
	}

	private void help(ArrayList<ArrayList<Integer>> res,
			ArrayList<Integer> last, int[] candidates, int lastsum, int target){
		if(last.size() == 0){
			//no item in last list
			for(int i = 0; i < candidates.length; i++){
				ArrayList<Integer> list= new ArrayList<Integer>();
				list.add(candidates[i]);
				if(candidates[i] == target){
					res.add(list);
				}
				else if (candidates[i] < target){
					help(res,list,candidates,candidates[i],target);
				}
			}
		}
		else{
			for(int i = 0; i < candidates.length; i++){
				if(candidates[i] >= last.get(last.size() - 1)){
					ArrayList<Integer> list = new ArrayList<Integer>(last);
					list.add(candidates[i]);
					if(lastsum +candidates[i] == target)
						res.add(list);
					else if(lastsum + candidates[i] < target)
						help(res,list,candidates,candidates[i] + lastsum,target);
				}
			}
		}
	}
}

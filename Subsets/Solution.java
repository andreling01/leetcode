import java.util.*;
public class Solution {
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		if(S == null)
			return new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());
		if(S.length == 0)
			return result;
		Arrays.sort(S);
		for(int i = 0; i < S.length; i++){
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(S[i]);
			result.add(temp);
		}
		for(int i = 2; i <= S.length;i++){
			subsetHelp(result,new ArrayList<Integer>(),S,0,i);
		}
		return result;
	}
	
	private void subsetHelp(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> last,
			int[] S, int index, int length){
		if(S.length - index < length)
			return;
		
		if(length == 0)
			result.add(last);
		else{
			for(int i = index; i < S.length; i++){
				ArrayList<Integer> newlist = new ArrayList<Integer>(last);
				newlist.add(S[i]);
				subsetHelp(result,newlist,S,i + 1,length - 1);
			}
		}
	}
}

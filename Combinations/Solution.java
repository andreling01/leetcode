import java.util.*;
public class Solution {
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> last = new ArrayList<Integer>();
		getCombine(result,last,0,n,k);
		return result;
	}
	
	private static void getCombine(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> last, 
			int rangeStart, int rangeEnd, int k){
		if(rangeStart > rangeEnd)
			return;
		if(k == 0){
			result.add(last);
			return;
		}
		for(int i = rangeStart + 1; i <= rangeEnd; i++){
			ArrayList<Integer> newlist = new ArrayList<Integer>(last);
			newlist.add(i);
			getCombine(result,newlist,i,rangeEnd,k-1);
		}
		return;
	}
	
	public static void main(String[] args){
		ArrayList<ArrayList<Integer>> result;
		result = combine(3,2);
	}
}

import java.util.*;
public class Solution {
	public static ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
		if(num == null)
			return new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());

		int start = 0;
		for(int i = 0; i < num.length; i++){
			int size = result.size();
			for(int j = start; j < size; j++){
				ArrayList<Integer> sub = new ArrayList<Integer>(result.get(j));  
				sub.add(num[i]);  
				result.add(sub);
			}
			if(i < num.length - 1 && num[i + 1] == num[i])  
	            start = size;  
	        else  
	            start = 0; 
		}
		return result;
	}
	
	public static void main(String[] args){
		int[] S = {1,2,2};
		ArrayList<ArrayList<Integer>> result = subsetsWithDup(S);
	}
}

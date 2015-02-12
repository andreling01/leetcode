import java.util.*;
public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> lastRow = new ArrayList<Integer>();
		for(int i = 0; i < numRows; i++){
			if(i == 0){
				ArrayList<Integer> curr = new ArrayList<Integer>();
				curr.add(1);
				result.add(curr);
			}
			else if (i == 1){
				ArrayList<Integer> curr = new ArrayList<Integer>();
				curr.add(1);
				curr.add(1);
				lastRow = curr;
				result.add(curr);
			}
			else{
				lastRow = generateHelp(lastRow);
				result.add(lastRow);
			}
			
		}
		return result;
	}
	
	private ArrayList<Integer> generateHelp(ArrayList<Integer> last){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(1);
		for(int i = 0; i < last.size() - 1; i++){
			result.add(last.get(i) + last.get(i + 1));
		}
		result.add(1);
		return result;
	}
}

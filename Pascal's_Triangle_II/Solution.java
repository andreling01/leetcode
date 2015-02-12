import java.util.*;
public class Solution {
	public ArrayList<Integer> getRow(int rowIndex) {
		int[] result = new int[rowIndex + 1];
		result[0] = 1;
		if(rowIndex == 0){
			return arrayToList(result);
		}
		for(int i = 1; i < rowIndex + 1; i++){
			for(int j = i - 1; j > 0; j--){
				result[j] = result[j] + result[j - 1];
			}
			result[i] = 1;
		}
		return arrayToList(result);
	}
	
	private ArrayList<Integer> arrayToList(int[] data){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < data.length; i++){
			result.add(data[i]);
		}
		return result;
	}
}

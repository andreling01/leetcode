import java.util.*;	
public class Solution {
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		if(triangle.size() == 0 || triangle == null)
			return 0;
		int[] arr = new int[triangle.size()];
		for(int i = triangle.size() - 1; i >= 0; i--){
			if(i == triangle.size() - 1){
				for(int j = 0; j < triangle.get(i).size(); j++){
					arr[j] = triangle.get(i).get(j);
				}
			}
			else{
				for(int j = 0; j < triangle.get(i).size(); j++){
					int min = Math.min(triangle.get(i).get(j) + arr[j], triangle.get(i).get(j) + arr[j + 1]);
					arr[j] = min;
				}
			}
		}
		return arr[0];
	}
}


public class Solution {
	public int numTrees(int n) {
		return numTreesHelp(1,n);
	}
	
	private int numTreesHelp(int start,int end){
		if(start > end){
			return 1;
		}
		
		if(start == end){
			return 1;
		}
		
		int result = 0;
		
		for(int i = start; i <= end; i++){
			result += numTreesHelp(start, i - 1) * numTreesHelp(i + 1, end);
		}
		
		return result;
	}
}

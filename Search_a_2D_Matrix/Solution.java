
public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		return matrixSearch(matrix, 0, matrix.length - 1, target);
	}
	
	
	private boolean matrixSearch(int[][]matrix, int headline, int endline, int target){
		if(headline > endline)
			return false;
		if(headline == endline)
			return binarySearch(matrix[headline], 0, matrix[headline].length - 1, target);
		if(headline == endline - 1){
			if(matrix[endline][0] == target)
				return true;
			else if(matrix[endline][0] > target)
				return binarySearch(matrix[headline], 0, matrix[headline].length - 1, target);
			else
				return binarySearch(matrix[endline], 0, matrix[endline].length - 1, target);		
		}
		int midline = (headline + endline) / 2;
		if(matrix[midline][0] == target)
			return true;
		else if (matrix[midline][0] > target)
			return matrixSearch(matrix, headline, midline - 1, target);
		else{
			return matrixSearch(matrix,midline,endline,target);
		}
	}
	
	
	private boolean binarySearch(int[] array, int head, int end, int target){
		if(head > end)
			return false;
		if(head == end)
			return (array[head] == target);
		int mid = (head + end) / 2;
		if(array[mid] == target)
			return true;
		else if(array[mid] > target)
			return binarySearch(array, head, mid - 1, target);
		else
			return binarySearch(array, mid + 1, end, target);
	}
}

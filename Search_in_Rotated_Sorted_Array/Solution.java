
public class Solution {
	public static int search(int[] A, int target) {
		return searchHelp(A, 0, A.length - 1, target);
	}
	
	private static int searchHelp(int[]A, int start,int end,int target){
		if(start > end)
			return -1;
		int mid = (start + end) / 2;
		if(A[mid] > A[start]){
			if(A[mid] >= target && A[start] <= target)
				return binarySearch(A,start,mid,target);
			else
				return searchHelp(A,mid + 1,end,target);
		}
		else{
			if(A[mid] <= target && A[end] >= target)
				return binarySearch(A,mid,end,target);
			else
				return searchHelp(A,start,mid - 1,target);
		}
	}

	private static int binarySearch(int[] A, int start, int end, int target){
		if(start > end)
			return -1;
		int mid = (start + end) / 2;		
		
		if(A[mid] == target)
			return mid;
		else if(A[mid] > target)
			return binarySearch(A,start,mid - 1,target);
		else
			return binarySearch(A,mid + 1,end,target);
	}
	
	public static void main(String[] args){
		int[] A = {3,5,1};
		System.out.println(search(A,1));
		
	}
	
}

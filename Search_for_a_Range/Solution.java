
public class Solution {
	public int[] searchRange(int[] A, int target) {
		return binarySearchHelp(A,0,A.length - 1,target);
	}
	
	public int[] binarySearchHelp(int[] A, int head, int tail, int target){
		int[] result = {-1,-1};
		if(head > tail)
			return result;
		if(head == tail){
			if(A[head] == target)
				return helpFunction(A,head,target);
			else
				return result;
		}
		int mid = (head + tail) / 2;
		if(A[mid] == target)
			return helpFunction(A,mid,target);
		else if(A[mid] > target)
			return binarySearchHelp(A, head, mid - 1, target);
		else{
			return binarySearchHelp(A, mid + 1, tail, target);
		}
			
	}
	
	public int[] helpFunction(int[] A,int position,int target){
		int leftIndex = position;
		int rightIndex = position;
		while(leftIndex - 1 >= 0 && A[leftIndex - 1] == target)
			leftIndex--;
		while(rightIndex + 1 < A.length && A[rightIndex + 1] == target)
			rightIndex++;
		int[] result = new int[2];
		result[0] = leftIndex;
		result[1] = rightIndex;
		return result;
	}
}

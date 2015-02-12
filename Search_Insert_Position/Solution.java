
public class Solution {
	public static int searchInsert(int[] A, int target) {
		if(target > A[A.length - 1])
			return A.length;
		return binarySearch(A,0,A.length - 1,target);
	}

	private static int binarySearch(int[] A, int head, int tail, int target){
		int index = (tail - head) / 2 + head;
		if(A[index] == target)
			return index;
		if(head >= tail){
			if(A[index] > target){
				return index;
			}
			else{
				return index + 1;
			}
		}

		if(A[index] > target)
			return binarySearch(A,head,index - 1,target);
		else
			return binarySearch(A,index + 1,tail,target);

	}

	public static void main(String[] args){
		int A[] = {0, 1, 4, 5, 6, 7, 15, 19};
		System.out.println(searchInsert(A,10));
	}
}

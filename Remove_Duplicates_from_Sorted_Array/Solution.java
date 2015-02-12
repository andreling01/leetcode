
public class Solution {
	public static int removeDuplicates(int[] A) {
		if(A.length == 0)
			return 0;
		int last = A[0];
		int index = 0;
		for(int i = 0; i < A.length; i++){
			if(A[i] != last){
				index++;
				A[index] = A[i];
				last = A[i];
			}
		}
		return index + 1;
	}
	
	public static void main(String[] args){
		int A[] = {1, 1, 1, 2};
		int length = removeDuplicates(A);
		for(int i = 0; i < length; i++){
			System.out.println(A[i]);
		}
	}
}

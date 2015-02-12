
public class Solution {
	public static int singleNumber(int[] A) {
		int result = 0;
		for(int i = 0; i < A.length; i++){
			result = result ^ A[i];
		}
		return result;
	}
	
	public static void main(String[] args){
		int A[] = {0,1,1,2,0,3,3};
		System.out.println(singleNumber(A));
	}
}

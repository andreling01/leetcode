
public class Solution {
	public static int singleNumber(int[] A) {
		int one = 0;
		int two = 0;
		for(int i = 0; i < A.length; i++){
			int newone = (one ^ A[i]) & ~two;
			int newtwo = A[i] & one | ~A[i] & two;
			one = newone;
			two = newtwo;
		}
		return one;
	}
	
	public static void main(String[] args){
		int A[] = {0,1,1,2,0,0,1,3,3,3};
		System.out.println(singleNumber(A));
	}
}

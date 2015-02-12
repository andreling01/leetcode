
public class Solution {
	public static int firstMissingPositive(int[] A) {
		int i = 0;
		while(i < A.length){
			if(A[i] > 0 && A[i] < A.length && A[A[i]] != A[i]){
				swap(A,i,A[i]);
			}
			else
				i++;
		}
		int k = 1;
		while(k < A.length && A[k] == k)
			k++;
		if(A.length == 0 || k < A.length)
			return k;
		else{
			if(A[0] == k)
				return k + 1;
			else
				return k;
		}
	}
	
	private static void swap(int[] A, int a, int b){
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
	
	public static void main(String[] args){
		int[] A = {3,5,4,1,-1,-2,0,1};
		firstMissingPositive(A);
	}
}

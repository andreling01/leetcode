
public class Solution {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		for(int i = 0; i < n/2; i++){
			for(int j = i; j < n - 1 - i; j++){
				swap(matrix,i,j,j,n - 1 - i);
				swap(matrix,n-1-j,i,n-1-i,n-1-j);
	            swap(matrix,i,j,n-1-i,n-1-j);
			}
		}
	}
	
	private void swap(int[][] matrix, int i, int j, int m, int n){
		int temp = matrix[i][j];
		matrix[i][j] = matrix[m][n];
		matrix[m][n] = temp;
	}
}

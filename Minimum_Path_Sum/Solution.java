
public class Solution {
	public static int minPathSum(int[][] grid) {
		int[][] result = new int[grid.length][grid[0].length];
		result[0][0] = grid[0][0];
		
		for(int i = 1; i < result.length; i++){
			result[i][0] = result[i - 1][0] + grid[i][0];
		}
		
		for(int i = 1; i < result[0].length;i++){
			result[0][i] = result[0][i -1] + grid[0][i];
		}
		
		for(int i = 1; i < result.length; i++){
			for(int j = 1; j < result[0].length; j++){
				int temp1 = result[i - 1][j] + grid[i][j];
				int temp2 = result[i][j - 1] + grid[i][j];
				int minDistance = Math.min(temp1, temp2);
				result[i][j] = minDistance;
			}
		}
		return result[grid.length - 1][grid[0].length - 1];
	}
	
	public static void main(String[] args){
		int [][] A = {{1,2,5},{3,2,1}};
		System.out.println(minPathSum(A));
	}
}


public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int [][] result = new int [obstacleGrid.length][obstacleGrid[0].length];
		boolean obstacleRow = false;
		boolean obstacleCol = false;
		if(obstacleGrid[0][0] == 1)
			return 0;
		else if (obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1)
			return 0;
		else
			result[0][0] = 1;

		//initial column
		for(int i = 1; i < result.length; i++){
			if(obstacleGrid[i][0] == 0 && !obstacleCol)
				result[i][0] = 1;
			else if(obstacleGrid[i][0] == 1){
				obstacleCol = true;
				result[i][0] = 0;
			}
			else{
				result[i][0] = 0;
			}
		}

		//initial row
		for(int i = 1; i < result[0].length; i++){
			if(obstacleGrid[0][i] == 0 && !obstacleRow)
				result[0][i] = 1;
			else if(obstacleGrid[0][i] == 1){
				obstacleRow = true;
				result[0][i] = 0;
			}
			else{
				result[0][i] = 0;
			}
		}

		for(int i = 1; i < result.length; i++){
			for(int j = 1; j < result[0].length; j++){
				if(obstacleGrid[i - 1][j] == 1 && obstacleGrid[i][j - 1] == 1)
					result[i][j] = 0;
				else if(obstacleGrid[i - 1][j] == 1)
					result[i][j] = result[i][j - 1];
				else if(obstacleGrid[i][j - 1] == 1)
					result[i][j] = result[i - 1][j];
				else
					result[i][j] = result[i - 1][j] + result[i][j - 1];
			}
		}
		
		return result[result.length - 1][result[0].length - 1];

	}
}

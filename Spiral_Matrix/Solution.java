import java.util.*;
public class Solution {
	public ArrayList<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(matrix == null || matrix.length == 0)
			return result;
		int m = matrix.length;
		int n = matrix[0].length;
		int x = 0;
		int y = 0;

		while(m > 0 && n > 0){
			if(m == 1){
				for(int i = 0; i < n; i++){
					result.add(matrix[x][y++]);
				}
				break;
			}
			if(n == 1){
				for(int i = 0; i < m; i++){
					result.add(matrix[x++][y]);
				}
				break;
			}
			//left to right
			for(int i = 0; i < n - 1; i++){
				result.add(matrix[x][y++]);
			}
			//up to down
			for(int i = 0; i < m -1; i++){
				result.add(matrix[x++][y]);
			}
			//right to left
			for(int i = 0; i < n - 1; i++){
				result.add(matrix[x][y--]);
			}
			//down to up
			for(int i = 0; i < m - 1; i++){
				result.add(matrix[x--][y]);
			}
			x++;
			y++;
			m = m - 2;
			n = n - 2;
		}
		return result;

	}
}

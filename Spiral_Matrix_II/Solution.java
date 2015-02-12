
public class Solution {
	public static int[][] generateMatrix(int n) {
		int number = 1;
		int[][] result = new int[n][n];
		int rowNum = n;
		int colNum = n;
		int x = 0; 
		int y = 0;
		if(n == 1){
			result[0][0] = 1;
			return result;
		}
		while(rowNum> 0 && colNum > 0){
			if(rowNum == 1){
				for(int i = 0; i < colNum; i++){
					result[x][y++] = number;
					number++;
				}
			}
			//left to right
			for(int i = 0; i < colNum - 1; i++){
				result[x][y++] = number;
				number++;
			}
			//up to down
			for(int i = 0; i < rowNum - 1; i++){
				result[x++][y] = number;
				number++;
			}
			//right to left
			for(int i = 0; i < colNum - 1; i++){
				result[x][y--] = number;
				number++;
			}
			//down to up
			for(int i = 0; i < rowNum - 1; i++){
				result[x--][y] = number;
				number++;
			}
			rowNum = rowNum - 2;
			colNum = colNum - 2;
			x++;
			y++;
		}
		return result;
	}
	public static void main(String[] args){
		generateMatrix(3);
	}
}

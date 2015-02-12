
public class Solution {
	public static int climbStairs(int n) {
		return climbStairsHelp(n);
	}
	
	private static int climbStairsHelp(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		
		return climbStairsHelp(n -1) + climbStairsHelp(n -2); 
	}
	
	public static void main (String[] args){
		int n = 44;
		System.out.println(climbStairs(n));
	}
}

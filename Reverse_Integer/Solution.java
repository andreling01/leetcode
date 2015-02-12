
public class Solution {
	public static int reverse(int x) {
		boolean negative = false;
		if(x < 0){
			negative = true;
			x = Math.abs(x);
		}
		if(x == 0){
			return 0;
		}
		int result = 0;
		do{
			int remainder = x % 10;
			x = x / 10;
			result = result * 10;
			result = result + remainder;
		}while(x > 0);
		if(negative){
			result = result * -1;
		}
		return result;
	}
	
	public static void main (String[] args){
		int x = -1123;
		System.out.println(reverse(x));
	}
}

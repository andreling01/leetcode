
public class Solution {
	public boolean isPalindrome(int x) {
		if(x < 0)
			return false;
		int x_reverse = reverse(x);
		return (x == x_reverse);
	}
	
	private int reverse(int x) {
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
		return result;
	}
}

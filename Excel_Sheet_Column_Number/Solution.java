
public class Solution {
	public int titleToNumber(String s) {
		int result = 0;
		char[] carr = s.toCharArray();
		for(int i = 0; i < carr.length; i++){
			result += (carr[i] - 64) * Math.pow(26, (carr.length - 1 - i));
		}
		return result;
	}
}

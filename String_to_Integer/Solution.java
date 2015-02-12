
public class Solution {
	public int atoi(String str) {  
		String s = str.trim();  

		if (s.length() == 0) {  
			return 0;  
		}  

		int INT_MAX = Integer.MAX_VALUE;  
		int INT_MIN = Integer.MIN_VALUE;  

		int sign = 1;  
		int res = 0;  

		int i = 0;  
		if (s.charAt(0) == '-') {  
			sign = -1;  
			++i;  
		} else if (s.charAt(0) == '+') {  
			++i;  
		}  

		for (; i < s.length(); ++i) {  
			char digit = s.charAt(i);  
			if (digit >= '0' && digit <= '9') {  
				if (res > INT_MAX / 10 || digit - '0' > INT_MAX - res * 10) {  
					return sign == -1 ? INT_MIN : INT_MAX;  
				}  

				res = res * 10 + (digit - '0');  
			} else {  
				break;  
			}  
		}  

		return sign * res;  
	}  
}

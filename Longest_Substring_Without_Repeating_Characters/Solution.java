
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		boolean[] flag = new boolean[256];
		 
		int result = 0;
		int start = 0;
		char[] arr = s.toCharArray();
	 
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (flag[c]) {
				result = Math.max(result, i - start);
				for (int k = start; k < i; k++) {
					if (arr[k] == c) {
						start = k + 1;
						break;
					}
					flag[arr[k]] = false;
				}	
			} else {
				flag[c] = true;
			}
		}
	 
		result=Math.max(arr.length-start,result);
	 
		return result;
	}
}

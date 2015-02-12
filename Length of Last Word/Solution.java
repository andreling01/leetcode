
public class Solution {
	public int lengthOfLastWord(String s) {
		if(s.equals(""))
			return 0;

		char[] carr = s.toCharArray();
		int count = 0;
		
		for(int i = carr.length - 1; i >=0; i--){
			if(carr[i] == ' ' && i == carr.length - 1)
				continue;
			else if(carr[i] != ' ')
				count++;
			else if(carr[i] == ' ' && count != 0)
				return count;
		}
		
		return count;
	}
}

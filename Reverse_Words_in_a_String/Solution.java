
public class Solution {
	public static String reverseWords(String s) {
		s = s.trim();  
		return helper(s,0).toString();  
	}  
	
	private static StringBuilder helper(String s, int index)  
	{  
		if(index>=s.length())  
			return new StringBuilder();   
		StringBuilder cur = new StringBuilder();  
		int lastIndex = index;  
		while(index < s.length() && s.charAt(index)!=' ')  
		{  
			cur.append(s.charAt(index++));  
		}  
		while(index < s.length() && s.charAt(index)==' ')  
			index++;  
		if(lastIndex == 0)  
			return helper(s,index).append(cur);  
		return helper(s,index).append(cur).append(' ');  
	}  
	
	public static void main(String[] args){
		String str = "the sky is blue ";
		System.out.println(reverseWords(str));
	}
}

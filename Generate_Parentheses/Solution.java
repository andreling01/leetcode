import java.util.*;
public class Solution {
	public static ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> result = new ArrayList<String>();
		if(n == 0)
			return result;
		return generateHelp(n,0,0,new StringBuffer());

	}

	private static ArrayList<String> generateHelp(int n, int left,int right, StringBuffer buf){
		ArrayList<String> result = new ArrayList<String>();
		if(left > n || right > n){
			return result;
		}
		if(right == n){
			result.add(buf.toString());
			return result;
		}
		if(left < n){
			StringBuffer newbuf = new StringBuffer(buf);
			newbuf.append("(");
			result.addAll(generateHelp(n,left + 1,right, newbuf));
		}

		if (right < left) {
			StringBuffer newBuf = new StringBuffer(buf);
			newBuf.append(")");
			result.addAll(generateHelp(n, left, right + 1, newBuf));
		}
		return result;
	}
	
	public static void main(String[] args){
		int n = 3;
		generateParenthesis(n);
	}
}

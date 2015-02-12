import java.util.*;
public class Test {
	public static int longestValidParentheses(String s) {
        if(s.equals("")) return 0;
        Stack<Integer> st = new Stack<Integer>();
        int result = 0;
        int currLength = 0;
        char[] carr = s.toCharArray();
        for(int i = 0; i < carr.length; i++){
            if(carr[i] == '('){
                st.push(i);
            }
            else{
                if(!st.empty()){
                    currLength = i - st.pop() + 1;
                }
                else{
                    if(currLength > result){
                        result = currLength;
                        currLength = 0;
                    }
                }
            }
        }
        if(currLength > result)
            result = currLength;
        return result;
    }
	
	public static void main(String[] args){
		String s = "()()";
		System.out.println(longestValidParentheses(s));
	}
}

import java.util.*;
public class Solution {
	public boolean isValid(String s) {
		char [] carr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < carr.length; i++){
			if(carr[i] == '(' || carr[i] == '[' || carr[i] == '{'){
				stack.push(carr[i]);
			}
			else if(carr[i] == ')'){
				if(stack.size() == 0)
					return false;
				char compare = stack.pop();
				if(compare != '(')
					return false;
			}
			else if(carr[i] == ']'){
				if(stack.size() == 0)
					return false;
				char compare = stack.pop();
				if(compare != '[')
					return false;
			}
			else{
				if(stack.size() == 0)
					return false;
				char compare = stack.pop();
				if(compare != '{')
					return false;
			}
		}
		if(stack.size() == 0)
			return true;
		else
			return false;
	}
}

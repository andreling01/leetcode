import java.util.*;
public class Solution {
	public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < tokens.length; i++){
            int number;
            try{
                number = Integer.parseInt(tokens[i]);
                st.push(number);
            }
            catch(NumberFormatException e){
                char[] symbol = tokens[i].toCharArray();
                int number1,number2,result;
                switch(symbol[0]){
                    case '+':
                        number1 = st.pop();
                        number2 = st.pop();
                        result = number1 + number2;
                        st.push(result);
                        break;
                    case '-':
                        number1 = st.pop();
                        number2 = st.pop();
                        result = number2 - number1;
                        st.push(result);
                        break;
                    case '*':
                        number1 = st.pop();
                        number2 = st.pop();
                        result = number1 * number2;
                        st.push(result);
                        break;
                    case '/':
                        number1 = st.pop();
                        number2 = st.pop();
                        result = number2 / number1;
                        st.push(result);
                        break;
                    default:
                        break;
                }
            }
            
        }
        return st.pop();
    }
	
	public static void main(String[] args){
		String[] list = {"4", "13", "5", "/", "+"};
		int result = evalRPN(list);
		System.out.println(result);
	}
	
}

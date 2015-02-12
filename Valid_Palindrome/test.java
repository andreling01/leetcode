
public class test {
	public static boolean isPalindrome(String s) {

		if(s.length()==0||(s.length()==1)){
			return true;
		}

		String curr = s.trim();

		char[] chars = curr.toLowerCase().toCharArray();

		int i = 0;
		int j = chars.length-1;

		while(i<j){

			while(i<(chars.length-1) && (!((chars[i] >='a') && (chars[i] <= 'z')) &&!((chars[i]>='0') &&(chars[i] <='9'))) ){

				i++;

			}

			while(j>0 && (!(chars[j] >='a') && (chars[j]<='z') && !((chars[j]>='0') &&(chars[j] <='9')))){

				j--;

			}

			if(chars[i] != chars[j]){
				return false;
			}
			i++;
			j--;
		}

		return true;


	}
	
	public static void main(String[] args){
		String s = ",.";
		isPalindrome(s);
	}
}

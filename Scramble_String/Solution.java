
public class Solution {
	public boolean isScramble(String s1, String s2) {
		if( s1==null||s2==null){
			return false;
		}

		if (s1.length()==0){
			return s2.length()==0;
		}
		if (s1.length()!=s2.length()){
			return false;
		}
		if (s1.equals(s2)){
			return true;
		}

		int value1=0;
		int value2=0;

		// check is s1 and s2 has same chars
		for (int i=0; i<s1.length(); i++){
			value1+=s1.charAt(i)-'0';
			value2+=s2.charAt(i)-'0';
		}

		if (value1!=value2){
			return false;
		}

		for (int i =1; i<s1.length(); i++){
			String s1Left=s1.substring(0, i);
			String s1Right=s1.substring(i);

			String s2Left=s2.substring(0,i);
			String s2Right=s2.substring(i);

			if (isScramble(s1Left, s2Left)&&isScramble(s1Right,s2Right)){
				return true;
			}

			s2Left=s2.substring(s2.length()-i);
			s2Right=s2.substring(0, s2.length()-i);

			if (isScramble(s1Left, s2Left)&&isScramble(s1Right,s2Right)){
				return true;
			}
		}

		return false;
	}
}

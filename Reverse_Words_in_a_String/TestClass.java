
public class TestClass {
	public static String reverseWords(String s) {
		s = s.trim();
        if(s.equals(""))
            return s;
        char[] carr = s.toCharArray();
        char[] newStr = new char[carr.length];
        int index = 0;
        for(int i = carr.length - 1; i >= 0; i--){
            if(carr[i] == ' ' || i == 0){
            	int j;
            	if(i == 0){
            		j = i;
            	}
            	else
            		j = i + 1;
                while(j < carr.length && carr[j] != ' '){
                    newStr[index] = carr[j];
                    index++;
                    j++;
                }
                if(index < carr.length - 1){
                    newStr[index] = ' ';
                    index++;
                }
            }
        }
        return new String(newStr); 
	}  
	
	
	public static void main(String[] args){
		String str = "the sky is blue";
		System.out.println(reverseWords(str));
	}
}

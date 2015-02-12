
public class test {
	public static String help(String s){
		if(s.equals("") || s == null){
			return null;
		}
		StringBuffer buffer = new StringBuffer();
		char[] carr = s.toCharArray();
		for(int i = 0; i < carr.length; i++){
			if(carr[i] != 'a' && carr[i] != 'e' && carr[i] != 'o' && carr[i] != 'i' && carr[i] != 'u'){
				buffer.append(carr[i]);
			}
		}
		return buffer.toString();
	}
	
	public static void main(String[] args){
		String s = "";
		System.out.println(help(s));
	}
}

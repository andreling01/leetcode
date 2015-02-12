
public class Solution {
	public static String countAndSay(int n) {
		if(n == 0)
			return "";
		String lastString = "1";
		int count = n - 1;
		while(count > 0){
			int letterCount = 1;
			char[] arr = lastString.toCharArray();
			String newString = "";
			char lastInt = arr[0];
			for(int i = 1; i < arr.length; i++){
				if(arr[i] == lastInt){
					letterCount++;
				}
				else{
					newString += String.valueOf(letterCount);
					newString += String.valueOf(lastInt);
					lastInt = arr[i];
					letterCount = 1;
				}
			}
			newString += String.valueOf(letterCount);
			newString += String.valueOf(lastInt);
			lastString = newString;
			count--;
		}
		return lastString;
			
	}
	
	public static void main(String[] args){
		int n = 6;
		System.out.println(countAndSay(n));
	}
}

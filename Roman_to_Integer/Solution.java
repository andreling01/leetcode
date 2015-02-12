import java.util.*;
public class Solution {
	public static int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		char[] c = s.toCharArray();
		int sum = map.get(c[c.length - 1]);
		for(int i = c.length - 2; i >= 0; i--){
			if(map.get(c[i + 1]) > map.get(c[i])){
				sum -= map.get(c[i]);
			}
			else{
				sum += map.get(c[i]);
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args){
		String s = "DCXXI";
		System.out.println(romanToInt(s));
	}
}

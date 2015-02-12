import java.util.*;
public class Solution {
	public static ArrayList<Integer> grayCode(int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int count = 0x01 << n;
		for(int i = 0; i < count; i++){
			result.add(i ^ (i >> 1));
		}
		return result;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> result = grayCode(3);
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}

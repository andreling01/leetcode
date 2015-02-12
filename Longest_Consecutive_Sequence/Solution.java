import java.util.*;
public class Solution {
	public static int longestConsecutive(int[] num) {
		HashMap<Integer,Integer> storage = new HashMap<Integer,Integer>();
		int maxLen = 1;
		for(int i = 0; i < num.length; i++){
			if(storage.size() == 0){
				storage.put(num[i], 1);
				continue;
			}
			if(storage.containsKey(num[i]))
				continue;
			if(storage.containsKey(num[i] + 1) && storage.containsKey(num[i] - 1)){
				int leftLen = storage.get(num[i] - 1);
				int rightLen = storage.get(num[i] + 1);
				int newLen = leftLen + rightLen + 1;
				//update the head and tail of the sequence
				storage.put(num[i] - leftLen, newLen);
				storage.put(num[i] + rightLen, newLen);
				storage.put(num[i], newLen);
				if(newLen > maxLen)
					maxLen = newLen;
			}
			else if(storage.containsKey(num[i] + 1)){
				int rightLen = storage.get(num[i] + 1);
				int newLen = rightLen + 1;
				storage.put(num[i] + rightLen, newLen);
				storage.put(num[i], newLen);
				if(newLen > maxLen)
					maxLen = newLen;
			}
			else if(storage.containsKey(num[i] - 1)){
				int leftLen = storage.get(num[i] - 1);
				int newLen = leftLen + 1;
				storage.put(num[i] - leftLen, newLen);
				storage.put(num[i], newLen);
				if(newLen > maxLen)
					maxLen = newLen;
			}
			else{
				storage.put(num[i], 1);
			}
		}
		return maxLen;
	}
	
	public static void main(String[] args){
		int[] arr = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
		System.out.println(longestConsecutive(arr));
	}
}

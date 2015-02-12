import java.util.*;
public class Solution {
	public ArrayList<Integer> findSubstring(String S, String[] L) {
		if(L==null || L.length==0) 
			return null;
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<String,Integer> needMap = new HashMap<String,Integer>();
		for(int i = 0; i < L.length; i++){
			if(needMap.containsKey(L[i])){
				needMap.put(L[i], needMap.get(L[i]) + 1);
			}
			else{
				needMap.put(L[i],1);
			}
		}
		
		int numOfWords = L.length;
		int wordLen = L[0].length();
		
		int i = 0;
		while(S.length() - i >= numOfWords * wordLen){
			HashMap<String,Integer> checkMap = new HashMap<String,Integer>(needMap);
			for(int j = 0; j < numOfWords; j++){
				String temp = S.substring(i + j * wordLen, i + (j + 1) * wordLen);
				if(checkMap.containsKey(temp)){
					if(checkMap.get(temp) - 1 == 0){
						checkMap.remove(temp);
					}
					else{
						checkMap.put(temp, checkMap.get(temp) - 1);
					}
				}
				else{
					break;
				}
			}
			if(checkMap.size() == 0)
				result.add(i);
			i++;
		}
		return result;
	}
}

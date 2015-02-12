import java.util.*;
public class Solution {

	public static ArrayList<String> wordBreak(String s, Set<String> dict) {
		// Note: The Solution object is instantiated only once and is reused by each test case.
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		return wordBreakHelper(s,dict,map);
	}

	public static ArrayList<String> wordBreakHelper(String s, Set<String> dict, Map<String, ArrayList<String>> memo){
		if(memo.containsKey(s)) return memo.get(s);
		ArrayList<String> result = new ArrayList<String>();
		int n = s.length();
		if(n <= 0) return result;
		for(int len = 1; len <= n; ++len){
			String subfix = s.substring(0,len);
			if(dict.contains(subfix)){
				if(len == n){
					result.add(subfix);
				}else{
					String prefix = s.substring(len);
					ArrayList<String> tmp = wordBreakHelper(prefix, dict, memo);
					for(String item:tmp){
						item = subfix + " " + item;
						result.add(item);
					}
				}  
			}
		}
		memo.put(s, result);
		return result;
	}
	
	public static void main(String[] args){
		Set<String> map = new HashSet<String>();
		map.add("cats");
		map.add("cat");
		map.add("and");
		map.add("sand");
		map.add("dog");
		wordBreak("catsanddog",map);
	}
}


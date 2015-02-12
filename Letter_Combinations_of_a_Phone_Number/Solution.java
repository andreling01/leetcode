import java.util.*;
public class Solution {
	public ArrayList<String> letterCombinations(String digits) {
		ArrayList<String> res = new ArrayList<String> ();
		res.add("");
		if(digits==null) return res;
		String[] table = digitToString();
		for(int i=0;i<digits.length();i++){
			ArrayList<String> cur = new ArrayList<String>();
			char c = digits.charAt(i);
			if(c>='2' && c<='9'){
				for(String temp:res){
					for(int j=0;j<table[c-'2'].length();j++){
						cur.add(temp + table[c-'2'].charAt(j));
					}
				}
			}
			res= new ArrayList<String>(cur);
		}
		return res; 
	}

	public String[] digitToString(){
		String[] res = new String[8];
		char start = 'a';

		for(int i=0;i<8;i++){
			int count = (i==5||i==7)?4:3;
			StringBuilder temp = new StringBuilder("");
			for(int j=0;j<count;j++){
				temp.append((char)(start+j));
			}
			start=(char)(start+count);
			res[i] = temp.toString(); 
		}
		return res;
	}
}

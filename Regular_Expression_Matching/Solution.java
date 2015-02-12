
public class Solution {
	public boolean isMatch(String s, String p) {
		return isM(s,p,0,0);
	}
	
	private boolean isM(String s, String p, int i, int j){  
        if(j == p.length()){  //if p reach the end, then i must reach the end           
            return i == s.length();   
        }  
        if(j == p.length()-1){  //if p reach the last one, than i must reach the last one
            return (i == s.length()-1) && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.');  
        }  
  
        if(j+1<p.length() && p.charAt(j+1) != '*'){  
            if(i == s.length()){    
                return false;  
            }  
            if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'){   //if current letter match, recursion
                return isM(s, p, i+1, j+1);      
            }else{    // else return false
                return false;  
            }  
        }  
          
        //if next char is * then:
        while(i<s.length() && j<p.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.')){  
            //if current one is match
            if(isM(s, p, i, j+2)){  // at least find another match after two chars  
                return true;  
            }  
            i++;  
        }  
          
        //if current one is not match, skip two chars
        return isM(s, p, i, j+2);  
    }  
}

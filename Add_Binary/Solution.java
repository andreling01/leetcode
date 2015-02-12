
public class Solution {
	public String addBinary(String a, String b) {
		int i = a.length() - 1;      
        int j = b.length() - 1;     
        int c = 0;       
        char[] achar = a.toCharArray();  
        char[] bchar = b.toCharArray();  
        char[] reschar = new char[Math.max(achar.length, bchar.length)+1];  
        int k = 0;      
          
        while(true){  
            if(i<0 && j<0 && c==0){  
                break;  
            }  
              
            int aint = 0;  
            int bint = 0;  
              
            if(i >= 0){  
                aint = achar[i] - '0';  
            }  
            if(j >= 0){  
                bint = bchar[j] - '0';  
            }  
            if(aint + bint + c > 1){  
                reschar[k] = (char) ('0' + aint + bint + c - 2);  
                c = 1;  
            }else{  
                reschar[k] = (char) ('0' + aint + bint + c);  
                c = 0;  
            }  
            k++;  
            i--;  
            j--;  
        }  
        return new StringBuffer(new String(reschar, 0, k)).reverse().toString();  
	}
}

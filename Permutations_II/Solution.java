import java.util.*;
public class Solution {
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        if (num==null){
            return null;
        }
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        
        if (num.length==0){
            return result; 
        }
        
        ArrayList<Integer> temp=new ArrayList<Integer>();
        
        temp.add(num[0]);
        
        
        result.add(temp);
        
        for (int i=1; i<num.length; i++){
            result=insert(num[i], result);
        }
        return result;
    }
    private ArrayList<ArrayList<Integer>> insert(int i, ArrayList<ArrayList<Integer>> result){
        ArrayList<ArrayList<Integer>> newResult=new ArrayList<ArrayList<Integer>>();
        HashMap<ArrayList<Integer>, Boolean> ht=new HashMap<ArrayList<Integer>, Boolean>();
        
        for (ArrayList<Integer> current: result){
            for (int j=0; j<=current.size(); j++){
                ArrayList<Integer> temp=new ArrayList<Integer>();
                temp.addAll(current);
                temp.add(j, i);
                if (!ht.containsKey(temp)){
                    newResult.add(temp);
                    ht.put(temp, true);
                }
                
            }
        }
       return newResult;
    }
}

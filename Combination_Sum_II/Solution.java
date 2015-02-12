import java.util.*;
public class Solution {
public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if (num==null||num.length==0){
            return result;
        }
        
        ArrayList<Integer> current=new ArrayList<Integer>();
      
        int start=0;
        
        Arrays.sort(num);
        
        buildResult(num,start, target, current, result);
        
        return result;
        
    }
    
    private void buildResult(int[] num, int start, int target, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result){
        if (target==0){
    
            ArrayList<Integer> temp=new ArrayList<Integer>(current);
            result.add(temp);
            
            return;
        }
 
        
        for (int i=start; i<num.length; i++){
            if (num[i]>target){
                continue;
            }
            
            current.add(num[i]);
            buildResult(num,i+1, target-num[i], current,result);
            current.remove(current.size()-1);
            while(i+1<num.length && num[i]==num[i+1]){
                i++;
            }
        }
        
    }
}

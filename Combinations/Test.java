import java.util.*;
public class Test {
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> last = new ArrayList<Integer>();
        help(result,last,1,n,k);
        return result;
    }
    
    private static void help(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> last,int startPos, int n, int k){
        if(last.size() == k){
            result.add(new ArrayList<Integer>(last));
        }
        else{
            for(int i = startPos; i <= n; i++){
                last.add(i);
                help(result,last,startPos + 1,n, k);
                last.remove(last.size() - 1);
            }
        }
    }
    
    public static void main(String[] args){
    	ArrayList<ArrayList<Integer>> result = combine(3,2);
    	int n = 1;
    	System.out.println(n);
    }
}

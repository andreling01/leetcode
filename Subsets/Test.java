import java.util.*;
public class Test {
	public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> last = new ArrayList<Integer>();
        result.add(last);
        Arrays.sort(S);
        help(result,last,0,S);
        return result;
    }
    
    private static void help(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> last,int startPos, int[] s){
        for(int i = startPos; i < s.length; i++){
            last.add(s[i]);
            result.add(last);
            help(result,last,i + 1, s);
            last.remove(last.size() - 1);
        }
    }
    
    public static void main(String[] args){
    	int[] S = {0};
    	subsets(S);
    }
}

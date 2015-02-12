import java.util.*;
public class test {
	public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0)
            return 0;
        return help(triangle, 0, 0, 0);
    }
    
    private static int help(ArrayList<ArrayList<Integer>> triangle, int lastSum, int level, int position){
        if(level == triangle.size())
            return lastSum;
        return Math.max(help(triangle,lastSum + triangle.get(level).get(position),level + 1, position),help(triangle,lastSum + triangle.get(level).get(position),level + 1, position + 1));
    }
}

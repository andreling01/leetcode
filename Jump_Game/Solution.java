import java.util.*;
public class Solution {
	public static boolean canJump(int[] A) {
		if(A == null)
			return false;
		if(A.length <= 0)
			return false;
		
		boolean [] visited = new boolean[A.length];
		Stack<Integer> toVisit = new Stack<Integer>();
        toVisit.push(A.length-1);
        
        while(!toVisit.isEmpty()){
            int cur = toVisit.pop();
            visited[cur]=true;
            if(cur==0) return true;
            for(int i=0;i<A.length;i++){
                if(i!=cur && !visited[i] && i+A[i]>=cur){
                    toVisit.push(i);
                }
            }
        }
        return false;
	}
	
	public static void main(String[] args){
		int A[] = {2,3,1,1,4};
		canJump(A);
	}
}

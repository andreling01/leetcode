import java.util.*;
public class test {
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		int length = candidates.length;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> buffer = new ArrayList<Integer>(); 
		for(int i = 0; i < length; i ++){
			buffer.add(candidates[i]);
		}
		for(int i = length-1; i >= 0; i --){
			List<Integer> temp = helper(target,buffer,new ArrayList<Integer>());
			if(!temp.isEmpty()){
				result.add(temp);
			}
		}
		return result;
	}

	public static List<Integer> helper(int n, List<Integer> res, List<Integer> good){
		if(res.size()==0 && n != 0){
			return new ArrayList<Integer>();
		}
		int temp = res.get(res.size()-1);
		int mod = n%temp;

		if(mod == 0 && n == 1 && temp == 1){
			good.add(temp);
			return good;
		}
		else if(mod == 0 && (n!= 1)){

			for(int i = 0; i < n/temp; i ++){
				good.add(temp);
			}

			return good;
		}

		if(mod != 0 && mod < n){
			good.add(temp);
		}
		res.remove(res.size()-1);
		return helper(mod,res,good);
	}
	
	public static void main(String[] args){
		int[] arr = {1,2};
		int target = 1;
		combinationSum(arr,target);
		String a = "aaaa";
		String b = "bbbb";
		System.out.println(a + b);
	}
}

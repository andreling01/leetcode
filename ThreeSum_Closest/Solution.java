import java.util.Arrays;


public class Solution {
	public int threeSumClosest(int[] num, int target) {
		Arrays.sort(num);
		int result = num[0] + num[1] + num[2] - target;
		for(int i = 0; i < num.length - 2; i++){
			int j = i + 1;
			int k = num.length - 1;
			while(j < k){
				int d = num[i] + num[j] + num[k] - target;
				if(d == 0)
					return target;
				if(Math.abs(d) < Math.abs(result))
					result = d;
				if(d < 0)
					j++;
				else
					k--;
			}
		}
		return result + target;
	}
}

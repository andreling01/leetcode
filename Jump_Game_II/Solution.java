
public class Solution {
	public int jump(int[] A) {
		if (A==null||A.length==0){
			return -1;
		}

		if (A.length==1){
			return 0;
		}

		int minStep=0;

		int start=0;
		// current longest distance the jump can reach
		int end=A[start];

		// if current longest distance plus current postion passed the length of array
		// then return current minStep + 1;
		if (start+end>=A.length-1){
			return minStep+1;
		}

		while(end<A.length-1){
			minStep++;

			// record farest position can be reached by jump from position within current farest position
			int max=0;

			for (int i=start; i<=end; i++){
				int current=i+A[i];
				// pass the total length, return minStep+1, 

				if (current>=A.length-1){
					return minStep+1;
				}

				max=Math.max(max, current);
			}
			// update start position(items in array are not negative, so end+1 is exist)
			start=end+1;
			// update the most far position can reached for next jump
			end=max;
		}

		return minStep;
	}
}

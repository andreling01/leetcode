
public class Solution {
	public int removeDuplicates(int[] A) {
		if(A.length == 0)
			return 0;
		int last = A[0];
		int index = 1;
		boolean duplicate = false;
		
		for(int i = 1; i < A.length; i++){
			if(A[i] != last){
				duplicate = false;
				A[index] = A[i];
				last = A[i];
				index++;
			}
			else{
				if(!duplicate){
					duplicate = true;
					A[index] = A[i];
					last = A[i];
					index++;
				}
			}
		}
		return index;
	}
}

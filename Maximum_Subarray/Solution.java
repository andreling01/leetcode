
public class Solution {
	public static int maxSubArray(int[] A) {
		return maxSubArrayHelp(A,0,A.length - 1);
	}
	
	private static int maxSubArrayHelp(int[]A,int left,int right){
		if(left > right){
			return 0;
		}
		
		if(left == right){
			return A[left];
		}
		
		int mid = (left + right) / 2;
		int leftmax = maxSubArrayHelp(A,left,mid);
		int rightmax = maxSubArrayHelp(A,mid + 1,right);
		
		
		
		int leftsum = A[mid];
		int rightsum = A[mid + 1];
		int temp = 0;
		for(int i = mid; i >= left; i--){
			temp += A[i];
			if(temp > leftsum){
				leftsum = temp;
			}
		}
		
		temp = 0;
		for(int i = mid + 1; i <= right; i++){
			temp += A[i];
			if(temp > rightsum){
				rightsum = temp;
			}
		}
		
		return Math.max(Math.max(leftmax, rightmax), leftsum + rightsum);
	}
	
	public static void main(String[] args){
		int A[] = {1,2,-1,-2,2,1,-2,1};
		System.out.println(maxSubArray(A));
	}
}

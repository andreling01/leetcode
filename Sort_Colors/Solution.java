
public class Solution {
	public static final int RED = 0;
	public static final int WHITE = 1;
	public static final int BLUE = 2;
	
	public void sortColors(int[] A) {
		if(A == null || A.length == 0)
			return;
		int redIndex = -1;
	    int blueIndex = A.length;
	    int probe = 0;
	    while (probe < blueIndex) {
	        if (A[probe] == RED) {
	            swap(A, probe++, ++redIndex);
	        } else if (A[probe] == WHITE) {
	            probe++;
	        } else if (A[probe] == BLUE) {
	            swap(A, probe, --blueIndex);
	        }
	    }
	}
	
	private void swap(int[] a, int i, int j) {
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
}

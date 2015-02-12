
public class Solution {
	public double findMedianSortedArrays(int A[], int B[]) {
		int median = A.length + B.length;
		int i = 0;
		int j = 0;
		double prev = 0;
		double last = 0;
		if(median < 2){
			if (A.length == 0 && B.length == 0) return 0;
			if (A.length ==1) return A[0];
			else return B[0];
		}

		while((i + j) <= median/2){
			prev = last;
			if(i > A.length){
				last = B[j];
				j++;
			}
			else if (j>=A.length){
				last = A[i];
				i++;
			}

			else if (A[i]<B[j]){
				last = A[i];
				i++;
			}
			else{
				last=B[j];
				j++;
			}
		}
		if ((median & 1) == 0)
			return (prev + last) / 2.0;
		else
			return last;
	}
}


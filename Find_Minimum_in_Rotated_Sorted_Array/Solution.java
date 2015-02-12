
public class Solution {
	public int findMin(int[] num) {
		if(num == null || num.length == 0){
			return 0;
		}
		
		return help(num,0,num.length-1);
		
	}
	
	private int help(int[] num,int start, int end){
		if(num[start] < num[end]){
			return num[start];
		}
		if(start == end){
			return num[start];
		}
		int mid = (start + end)/2;
		if(num[mid] > num[mid + 1]){
			return num[mid + 1];
		}
		else{
			if(num[start] < num[mid]){
				return help(num,mid + 1,end);
			}
			else{
				return help(num,start,mid);
			}
		}
	}
}

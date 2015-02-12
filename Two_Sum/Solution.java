
public class Solution {
	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		for(int i = 0; i < numbers.length; i++){
			for(int j = i + 1; j < numbers.length; j++){
				if((numbers[i] + numbers[j]) == target){
					result[0] = i + 1;
					result[1] = j + 1;
					return result;
				}
			}
		}
		return result;
	}
	
	
	
	public static void main(String[] args){
		int[] numbers = {0, 4, 3, 0};
		int[] result = twoSum(numbers,0);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}

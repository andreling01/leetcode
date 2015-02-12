
public class Solution {
	public int[] plusOne(int[] digits) {
		boolean addOne = false;
		digits[digits.length - 1] = digits[digits.length - 1] + 1;
		if(digits[digits.length - 1] >= 10){
			digits[digits.length - 1] = digits[digits.length - 1] % 10;
			addOne = true;
		}
		int index = digits.length - 2;
		while(addOne && index >= 0){
			digits[index] = digits[index] + 1;
			if(digits[index] >= 10){
				digits[index] = digits[index] % 10;
				index--;
			}
			else{
				addOne = false;
			}
		}
		if(addOne){
			int[] result = new int[digits.length + 1];
			for(int i = 1; i < result.length; i++){
				result[i] = digits[i - 1];
			}
			result[0] = 1;
			return result;
			
		}
		else{
			return digits;
		}
		
	}
}

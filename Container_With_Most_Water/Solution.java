
public class Solution {
	public int maxArea(int[] height) {
		int start = 0; 
		int end = height.length - 1;
		int vol = 0;
		while(start < end){
			int min = Math.min(height[start],height[end]);
			vol = Math.max(vol, min*(end - start));
			if(height[start] < height[end])
				while(start < end && height[start] <= min)
					start++;
			else if(height[end] < height[start])
				while(start < end && height[end] <= min)
					end--;
			else{
				while(start < end && height[start] <= min)
					start++;
				while(start < end && height[end] <= min)
					end--;
			}
		}
		return vol;
	}
}


public class Solution {
	public static void main(String[] args){
		LRUCache cache = new LRUCache(2);
		cache.get(2);
		cache.set(2,6);
		cache.get(1);
		cache.set(1,5);
		cache.set(1,2);
		cache.get(1);
		cache.get(2);
	}

}

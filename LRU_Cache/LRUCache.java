import java.util.*;
import java.awt.*;

public class LRUCache{
	private HashMap<Integer,Node> map;
	private Node head;
	private int capacity;
	public LRUCache(int capacity) {
		map = new HashMap<Integer,Node>();
		head = null;
		this.capacity = capacity;
	}

	public int get(int key) {
		if(map.containsKey(key)){
			Node n = map.get(key);
			detach(n);
			attach(n);
			return n.entry.getValue();
		}
		else{
			return -1;
		}
	}

	public void set(int key, int value) {
		if(map.containsKey(key)){
			Node node = map.get(key);
			node.entry = new SimpleEntry(key,value);
			detach(node);
			attach(node);
			return;
		}
		Node node = new Node();
		node.entry = new SimpleEntry(key, value);
		if(map.size() < capacity){
			attach(node);
			map.put(key, node);
		}
		else{
			Node last = head.prev;
			detach(last);
			map.remove(last.entry.getKey());
			map.put(key, node);
			attach(node);
		}
	}

	class Node{
		Node prev;
		Node next;
		SimpleEntry entry;
	}

	class SimpleEntry{
		private int key;
		private int value;
		SimpleEntry(int key,int value){
			this.key = key;
			this.value = value;
		}
		
		int getKey(){
			return key;
		}
		
		int getValue(){
			return value;
		}
	}
	private void detach(Node node){
		if(node.equals(head)){
			head = node.next;
		}
		node.next.prev = node.prev;
		node.prev.next = node.next;

	}

	private void attach(Node node){
		if(head != null){
			head.prev.next = node;
			node.prev = head.prev;
			head.prev = node;
			node.next = head;
			head = node;
		}
		else{
			head = node;
			head.next = node;
			head.prev = node;
		}
	}
	
	
}


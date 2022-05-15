package BS;

public class Node {
	public int key; 
	public Node left;
	public Node right;
	
	public Node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	} 
	
	public void printData() {
		System.out.print(key+" ");
	}
	
	public boolean lessThanOrEqual(int key) {
		return this.key <= key;
	} 
	
	public boolean greaterThan(int key) {
		return this.key> key;
	} 
	
	public boolean lessThan(int key) {
		return this.key < key;
	} 
	
	public boolean hasKey(int key) {
		return this.key == key;
	}
}

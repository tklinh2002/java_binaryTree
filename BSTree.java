package BS;

public class BSTree {
	private int size;
	public Node root; 
	
	public BSTree() {
		this.size = 0;
		this.root = null; 
	}
	
	public int size() {
		return this.size;
	}
	
	public void insert(Node newNode) { 
		this.root = insert(this.root, newNode);
	}
	
	private Node insert(Node node, Node newNode) { 
		if (node == null) { 
			this.size++;
			return newNode;
		}
		
		if (newNode.lessThanOrEqual(node.key)) {
			node.left = insert(node.left, newNode);
		} else {
			node.right = insert(node.right, newNode);
		}
		return node;
	}
	
	public Node search(int key) {  
		return search(this.root, key);
	}
	
	private Node search(Node node, int key) { 
		if (node == null) return null;
		
		if (node.hasKey(key)) {
			return node;
		}
		if (node.lessThan(key)) {
			return search(node.right, key);
		} else {
			return search(node.left, key);
		}
	}
	
	public void delete(int key) {  
		this.root = delete(this.root, key); 
	}
	
	private Node delete(Node node, int key) { 
		if (node == null) return null;
		
		if (node.hasKey(key)) { 
			this.size--;
			if (node.left == null) {
				return node.right;
			}
			Node maxNode = node.left;
			Node preNode = maxNode;
			while (maxNode.right != null) {
				preNode = maxNode;
				maxNode = maxNode.right;
			}
			maxNode.right = node.right;
			if (maxNode != node.left) {
				maxNode.left = node.left;
				preNode.right = null;
			}
			return maxNode; 
		}
		if (node.lessThan(key)) {
			node.right = delete(node.right, key); 
		} else {
			node.left = delete(node.left, key);
		}
		return node;
	}
	
	public void printNLR() { 
		System.out.print("\n\nprintNLR ");
		printNLR(this.root);
	}
	
	private void printNLR(Node node) { 
		if (node == null) return;
		
		node.printData();
		printNLR(node.left);
		printNLR(node.right);
	}
	
	public void printLNR() {  
		System.out.print("\nprintLNR "); 
		printLNR(this.root);
	}
	
	private void printLNR(Node node) {  
		if (node == null) return;
 
		printLNR(node.left);
		node.printData();
		printLNR(node.right);
	}
	
	public void printLRN() {   
		System.out.print("\nprintLRN ");
		printLRN(this.root);
	}
	
	private void printLRN(Node node) {   
		if (node == null) return;
 
		printLRN(node.left); 
		printLRN(node.right);
		node.printData();
	}
}

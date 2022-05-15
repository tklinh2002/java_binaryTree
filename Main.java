package BS;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,5,8,9,6,3,4,7,10,15,26,14,17,18,0};
		BSTree tree = new BSTree(); 
		
		for (int i = 0; i < a.length; i++) {
			tree.insert(new Node(a[i]));
		}	
		tree.printNLR(); // N L R
		tree.printLNR(); // L N R
		tree.printLRN(); // L R N
		
	//	tree.delete(18);
		
	}
}

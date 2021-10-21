package binaryTrees;

public class TreeUse {
	
	public static void main(String[] args) {
		
		TreeNode r = new TreeNode(10);
		TreeNode c1 = new TreeNode(20);
		TreeNode c2 = new TreeNode(30);
		r.left = c1;
		r.right = c2;
		
		System.out.println(r.data + " " + r.left.data + " " + r.right.data);
		
	}

}

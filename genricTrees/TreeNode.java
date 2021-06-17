package genricTrees;

import java.util.ArrayList;

public class TreeNode<T> {
	public T data;
	public ArrayList<TreeNode<T>> children ;
	
	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}
	
	private TreeNode<T> root;
	private T size;
	
	public void print() {
		
	}
}


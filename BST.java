//1.Binary Search Tree Insertion

class BST{
	static Node root=null;

	class Node{
		Node next,right,left;
		int data;
		
		Node(int d){
			data=d;
			right=left=null;
		}
	}
	
	void inorder(Node root){
		
		if(root==null) return;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	void preorder(Node root){
		
		if(root==null) return;
		
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	void postorder(Node root){
		
		if(root==null) return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");	
	}
	
	void insert(int data){
		root = insertData(root,data);
	}
	
	Node insertData(Node root, int data){
		
		Node new_node = new Node(data);
		
		if(root==null){
			root = new Node(data);
			return root;
		}
		
		if(data<=root.data)
			root.left=insertData(root.left,data);
		else
			root.right=insertData(root.right,data);
		
		return root;
	}
	
	public static void main(String args[]){
		
		BST b = new BST();
		
		b.insert(70);
		b.insert(77);
		b.insert(10);
		b.insert(2);
		b.insert(60);
		b.insert(38);
		
		System.out.print("\n Inorder : ");
		b.inorder(root);
		System.out.print("\n Preorder : ");
		b.preorder(root);
		System.out.print("\n Postorder : ");
		b.postorder(root);
		
	}
}
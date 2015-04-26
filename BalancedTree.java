
public class BalancedTree {
    public static boolean findIt(Node root){
	if(root==null){
	    return true;
	}
	int minHt = findMinHt(root, 0);
	int maxHt = findMaxHt(root, 0);
	if(maxHt - minHt < 2)
	    return true;
        return false;
    }

    public static int findMinHt(Node root, int ht){
	if(root==null)
		return ht;
	return Math.min(findMinHt(root.left, ht+1), findMinHt(root.right, ht+1));
    }
	
    public static int findMaxHt(Node root, int ht){
	if(root==null)
	    return ht;
	return Math.max(findMaxHt(root.left, ht+1), findMaxHt(root.right, ht+1));
    }
	
    public static void main(String args[]){
	Node root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.left.left = new Node(4);
	root.left.right = new Node(5);
	root.right.left = new Node(6);
	root.right.right = new Node(7);
	root.left.left.left = new Node(8);
	root.left.left.left.left = new Node(9);
	System.out.println(findIt(root));
    }
}

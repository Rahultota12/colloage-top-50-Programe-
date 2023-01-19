class Node {
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
 
public class postOrder27 {
    Node root;
 
    postOrder27() {
         root = null; 
        }
    void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }
 
    void printPostorder() {
         printPostorder(root);
         }
    public static void main(String[] args)
    {
        postOrder27 tree = new postOrder27();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println( "\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }
}
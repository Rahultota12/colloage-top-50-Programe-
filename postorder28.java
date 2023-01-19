import java.util.*;
 class Node
 {
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        this.left = this.right = null;       
    }
};
 
public class postorder28
{
   
Node root;
 void postorder(Node head)
{
    Node temp = root;   
    HashSet<Node> visited = new HashSet<>();
    while ((temp != null  && !visited.contains(temp)))
    {
        if (temp.left != null &&
         !visited.contains(temp.left))
            temp = temp.left;
        else if (temp.right != null &&
        !visited.contains(temp.right))
            temp = temp.right;
        else
        {
            System.out.printf("%d ", temp.data);
            visited.add(temp);
            temp = head;
        }
    }
}
public static void main(String[] args)
{
    postorder28 gfg = new postorder28();
    gfg.root = new Node(8);
    gfg.root.left = new Node(3);
    gfg.root.right = new Node(10);
    gfg.root.left.left = new Node(1);
    gfg.root.left.right = new Node(6);
    gfg.root.left.right.left = new Node(4);
    gfg.root.left.right.right = new Node(7);
    gfg.root.right.right = new Node(14);
    gfg.root.right.right.left = new Node(13);
    gfg.postorder(gfg.root);
}
}
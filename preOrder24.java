import java.util.Stack;

class Node{
    int value;
    Node left,right;

    public Node(int value)
    {
        this.value=value;
        left=null;
        right=null;
    }
}
public class preOrder24{
    Node root; 
    public void PreOrder24(){
    root=null;
    }
    public void preOrder24()
    {
        if(root ==null)
        return ;
        Stack stack=new Stack(); 
        stack.push(root); 
        while(!stack.isEmpty())
        {
            Node temp=(Node) stack.pop(); 
            System.out.print(temp.value+" ");
            if(temp.right!=null)
            stack.push(temp.right); 
            if(temp.left!=null)
            stack.push(temp.left); 
        }
    }
    public static void main(String[] args)
    {
        preOrder24 t=new preOrder24();
        t.root=new Node(6);
        t.root.left=new Node(4);
        t.root.right=new Node(8);
        t.root.left.left=new Node(2);
        t.root.left.right=new Node(5);
        t.root.right.right=new Node(9);
        t.PreOrder24();
    }
}
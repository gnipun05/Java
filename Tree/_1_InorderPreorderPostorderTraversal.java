package Tree;

public class _1_InorderPreorderPostorderTraversal {

    public static void Inorder (Node root){
        if(root==null)  return ;
        Inorder(root.left);
        System.out.println(root.key);
        Inorder(root.right);
    }

    public static void Preorder (Node root){
        if(root==null)  return ;
        System.out.println(root.key);
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void Postorder (Node root){
        if(root==null)  return ;
        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.key);
    }
}

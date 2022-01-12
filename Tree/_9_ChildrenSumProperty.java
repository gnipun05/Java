package Tree;

public class _9_ChildrenSumProperty {
    public boolean checkProperty(Node root){
        if(root==null)  return true;
        if(root.left==null && root.right==null)
            return true;
        int sum=0;
        if(root.left!=null)
            sum+=root.left.key;
        if(root.right!=null)
            sum+=root.right.key;
        return (root.key==sum && checkProperty(root.left) && checkProperty(root.right));
    }
}
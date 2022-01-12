package Tree;

public class _10_CheckforBalancedBinaryTree {
    public int checkBalanced(Node root){  // returns -1 if tree is not balanced; else returns the height of tree
        if (root==null) return 0;
        int lh=checkBalanced(root.left);
        if(lh==-1)  return -1;
        int rh=checkBalanced(root.right);
        if(rh==-1)  return -1;
        if(Math.abs(lh-rh)>1)  return -1;
        else return Math.max(lh,rh)+1;
    }
}

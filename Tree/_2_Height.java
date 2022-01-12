package Tree;

public class _2_Height {
    public static int calcHeight(Node root){
        if (root==null) return 0;
        return (calcHeight(root.left)+calcHeight(root.right)+1);
    }
}
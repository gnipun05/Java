package Tree;

public class _3_NodesAt_K_Distance {
    public static void NodesAtK(Node root, int k){
        if(root==null) return;
        if(k==0){
            System.out.println(root.key);
            return;
        } 
        NodesAtK(root.left, k-1);
        NodesAtK(root.right, k-1);
    }
}

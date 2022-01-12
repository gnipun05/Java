package Tree;
import java.util.*;

public class _7_MaximumInBinaryTree {

    public static int findMax(Node root){  // Recursive sol are better when tree is close of being a balanced tree
        if(root==null)  return Integer.MIN_VALUE;
        return Math.max(Math.max(findMax(root.left), findMax(root.right)),root.key);
    }

    public static int getSize2(Node root) {  // Iterative sol are better when tree is close of being a skewed tree
        if(root==null)  return 0;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        int res=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            Node curr=q.poll();
            res=Math.max(res,curr.key);
            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);
        }
        return res;
    }

}

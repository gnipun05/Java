package Tree;
import java.util.*;

public class _6_SizeOfBinaryTree {

    public static int getSize1(Node root) {   // Recursive sol are better when tree is close of being a balanced tree
        if(root==null)  return 0;
        return getSize1(root.left)+getSize1(root.right)+1; 
    }

    public static int getSize2(Node root) {  // Iterative sol are better when tree is close of being a skewed tree
        if(root==null)  return 0;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        int count = 0;
        while(!q.isEmpty()){
            Node curr=q.poll();
            count++;
            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);
        }
        return count;
    }
}

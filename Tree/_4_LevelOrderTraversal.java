package Tree;
import java.util.*;

public class _4_LevelOrderTraversal {
    public static void LevelOrder(Node root){
        if(root==null) return;
        Queue <Node> q = new LinkedList<Node>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.println(temp.key);
            if(temp.left!=null)  q.offer(temp.left);
            if(temp.right!=null) q.offer(temp.right);
        }
    }
}
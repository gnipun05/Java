package Tree;
import java.util.*;

public class _11_MaximumWidthOfBinaryTree {
    public int maxWidth(Node root){
        if(root==null)  return 0;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        int res=0;
        while(!q.isEmpty()){
            int count = q.size();
            res=Math.max(res,count);
            for(int i=0; i<count; i++){
                Node temp = q.poll();
                if(root.left!=null)  q.offer(temp.left);
                if(root.right!=null)  q.offer(temp.right);
            }
        }   
        return res;
    }
}

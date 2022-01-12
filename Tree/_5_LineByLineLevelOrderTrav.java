package Tree;
import java.util.*;

public class _5_LineByLineLevelOrderTrav {

    public static void LineByLine1(Node root){
        Queue <Node> q = new ArrayDeque<>();
        q.offer(root);
        q.offer(null);
        while(q.size()>1){
            Node curr=q.poll();
            if(curr==null){
              System.out.println();
              q.offer(null);
              continue;
            }
            System.out.println(curr.key);
            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);
        }
    }

    public static void LineByLine2(Node root){
        Queue <Node> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int count = q.size();
            for(int i=0; i<count; i++){
                Node curr=q.poll();
                System.out.println(curr.key);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
        }
    }
}
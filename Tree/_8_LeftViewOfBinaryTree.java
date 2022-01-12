package Tree;
import java.util.*;

public class _8_LeftViewOfBinaryTree {
    
    int maxLevel=0;

    public void printLeftRecursive(Node root, int level){ // we can either make maxLevel and both functions all as static or leave all of them without it
        if(root==null)  return ;
        if(maxLevel<level){
            maxLevel=level;
            System.out.println(root.key+" ");
        }
        printLeftRecursive(root.left,level+1);
        printLeftRecursive(root.right, level+1);
    }

    public void printLeftView(Node root){
        printLeftRecursive(root, 1);
    }

    public void printLeftIterative(Node root){
        if(root==null)  return ;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int count = q.size();
            for(int i=0; i<count; i++){
                Node temp=q.poll();
                if(i==0)    System.out.println(temp.key+" ");
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
        }
    }
}
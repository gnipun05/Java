/* we make left reference as previous and right reference as next
   we make the order of doubly linked list as the inorder traversal of binary tree */

package Tree;

public class _12_BinaryTreeToDoublyLinkedList {

    Node prev=null;

    public Node Convert(Node root){
        if (root==null)  return null;
        Node head=Convert(root.left);
        if(prev==null)   head=root;
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        Convert(root.right);
        return head;
    }
}

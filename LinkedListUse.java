
import java.util.*;
class Node {
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
}

public class LinkedListUse {
	public static Node takeinput()
	{
		 Node Head=null;
		
		Scanner s=new Scanner(System.in);
		// System.out.println("Enter the data");
		 int data=s.nextInt();
		// System.out.println(data);
		 while(data!=0)
		 {
			 Node newnode=new Node(data);
			 if(Head==null)
			 {
				 Head=newnode;
			 }
			 else
			 {
			 
				 Node temp=Head;
				 while(temp.next!=null)
				 {
					 temp=temp.next;
				 }
				 temp.next=newnode;
				 
			 }
			 data=s.nextInt();		 
		 }
         s.close();
		 return Head;
	}
	
	public static void Print(Node Head)
	{
		while(Head!=null)
		{
			System.out.print(Head.data+" ");
			Head=Head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//Node<Integer> node1=new Node<>(10);
		//System.out.println(node1.data);
		//System.out.println(node1.next);
		//Node<Integer> node2=new Node<>(5);
		//Node<Integer> node3=new Node<>(15);
		//Node<Integer> node4=new Node<>(30);
		//node1.next=node2;
		//node2.next=node3;
		//node3.next=node4;
		//System.out.println(node1.data);
		//	System.out.println(node1.next);
		//System.out.println(node1.data);
		//System.out.println(node2);
		//Node<Integer> Head=node1;
		Node temp1=takeinput();
		Print(temp1);	
	}
}
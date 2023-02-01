package DS;

import java.util.Scanner;

public class Circular_linklist {
	private int Size;
	public void Circular_linklist()
	{
		this.Size=0;
	}
	class Node
	{
		int data;
		Node next;
		
		public  Node(int data)
		{
			this.data=data;
			Size++;
		}
	}
	public Node head=null;
	public Node tail=null;
	
	public void add(int data)
	{ 
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			newNode.next=head;
			
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}
		
	}
	public void Display()
	{
		Node current=head;
		if(head==null)
		{
			System.out.println("This is Empty linked list");
			return;
		}
		else
		{
			System.out.println("The Node of circular linked List");
			do
			{
				System.out.print("["+current.data+"]"+"->");
				current=current.next;
			}while(current!=head);
			System.out.println();
		}
	}
	public int  getSize()
	{
		return Size;
	}
}	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circular_linklist cl=new Circular_linklist();
		/*cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(4);
		cl.add(5);
		cl.Display();*/
		
		/*	Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("\n<<<<<< menu >>>>>");
			System.out.println("\n 1.Add data");
			System.out.println("\n 2.Display Circular Linked List");
			System.out.println("\n 3. Display the Size");
			System.out.println("\n 4. Exist");
			
			System.out.println("Enter ur choice");
			
			
			switch(sc.nextInt())
			{
			case 1:
					System.out.println("Enter the value");
					cl.add(sc.nextInt());
					break;
					
			case 2:
					cl.Display();
					break;
			case 3:
				System.out.println("the Size of Circular Linklist is -> "+cl.getSize()); 
				break;
			case 4:
				System.exit(0);
				break;
				
			default :
					
					System.out.println("Wrong Choice..........");
					break;
			}
			System.out.println("Do yuo want to continue press......1");
		}while(sc.nextInt()==1);

		
	}

}*/

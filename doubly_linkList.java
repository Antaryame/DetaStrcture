package DS;

import java.util.Scanner;

public class doubly_linkList {
	private int Size;
	doubly_linkList()
	{
		this.Size=0;
	}
	
	
	class Node{
		int data;
		Node next;
		Node privious;
		
		public Node(int data)
		{
			this.data=data;
			Size++;
		}
	}
   Node head,tail=null;
   
   public void addNode(int data)
   {
	   Node newNode=new Node(data);
	   
	   
	   if(head==null)
	   {
		   head=tail=newNode;
		   
		   head.privious=null;
		   tail.next=null;
	   }
	   else
	   {
		   tail.next=newNode;
		   newNode.privious=tail;
		   tail=newNode;
		   tail.next=null;
	   }
   }
   public void Display()
   {
	   Node current = head;
	   if(head==null)
	   {
		   System.out.println("This list is Empty");
		   return;
	   }
	   System.out.println("Node of Doubly linklist");
	   
	   while(current!=null)
	   {
		   System.out.print("["+current.data+"]" + "->");
		   current=current.next;
	   }
   }
   void deleteNode(int key)
   {
	   Node temp=head,previous=null;
	   if(temp !=null && temp.data==key)
	   {
		   head=temp.next;
		   Size--;
		   return;
	   }
	 
	   while(temp!=null && temp.data!=key)
	   {
		   previous=temp;
		   temp=temp.next;
		   Size--;
	   }
	   if(temp==null)
	   {
		   return;
	   }
	   
	   previous.next=temp.next;
		
   }
   public int getSize()
   {
	   return Size;
   }
}
   /*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubly_linkList dlist=new doubly_linkList();
		
		/*dlist.addNode(1);
		dlist.addNode(2);
		dlist.addNode(3);
		dlist.addNode(4);
		dlist.addNode(5);
		
		dlist.Display();
		dlist.deleteNode(1);
		dlist.Display();
		System.out.println("\n the size of linkedList \n"+dlist.getSize());*/
		
		
   /*	Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("\n<<<<<< menu >>>>>");
			System.out.println("\n 1.Add NODE");
			System.out.println("\n 2.DELETE A NODE");
			System.out.println("\n 3. DISPLAY THE LINK LIST");
			System.out.println("\n 4. SIZE OF LINK LIST");
			System.out.println("\n 5. Exist");
			
			System.out.println("Enter ur choice");
			
			
			switch(sc.nextInt())
			{
			case 1:
					System.out.println("Enter a Value");
					dlist.addNode(sc.nextInt());
					break;
			case 2:
					System.out.println("which location you want delete node");
					dlist.deleteNode(sc.nextInt());
					break;
			case 3:
					dlist.Display();
					break;
			case 4:
					System.out.println("the size of doubly link list is ->"+dlist.getSize());
					break;
			case 5:
					System.exit(0);
					
		default: System.out.println("You choice a wrong option ..........");
					break;
			
			}
			System.out.println("\n Do yuo want to continue press.......1 \n");
		}while(sc.nextInt()==1);
	}

}*/

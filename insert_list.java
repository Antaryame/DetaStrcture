package DS;
import java.util.*;
public class insert_list {
	Node head;
	private int Size;
	insert_list()
	{
		this.Size=0;
	}
	class Node
	{
		String data;
		Node next;
		
	
		
		Node(String data)
		{
			this.data=data;
			this.next=null;		
		    Size++;
		}
	}
	
	//add first
	public void addFirst(String data )
	{
		Node newNode =new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	// add last
	public void addLast(String data)
	{
		Node newNode =new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next != null)
		{
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	
	//print last and first
	public  void printList()
	{ 
		Node currNode=head;
		while(currNode != null)
		{
			System.out.print(currNode.data +"->");
			currNode=currNode.next;
		}
		System.out.println("Null");
		
	}
   // delete first
	
	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("the list is empty");
			return;
		}
		Size--;
		head=head.next;
	}
	
	// Delete Last
	
   public void deleteLast()
   {
	   if(head == null)
		{
			System.out.println("the list is empty");
			return;
		}
	   Size--;
	   if(head.next==null)
	   {
		   head=null;
		   return;
	   }
	   Node secondLast=head;
	   Node lastNode=head.next;
	   while(lastNode.next !=null)
	   {
		   lastNode=lastNode.next;
		   secondLast=secondLast.next;
		   
	   }
	   secondLast.next=null;
   }
   public int getSize()
   {
	   return Size;
	   
   }
}
	
/*	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		insert_list list=new insert_list();
		/*list.addFirst("A");
		list.addFirst("is");
		list.printList();
		list.addLast("List");
		list.printList();
		list.addFirst("This");
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
		System.out.println(list.getSize()); */
	/*	Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("\n<<<<<< menu >>>>>");
			System.out.println("\n 1.Add Value First Position");
			System.out.println("\n 2.Add Value last Position");
			System.out.println("\n 3. Delete a Value First Position");
			System.out.println("\n 4. Delete a Value Last Position");
			System.out.println("\n 5. Display the single Link List");
			System.out.println("\n 6. Size of Link List");
			System.out.println("\n 7. Exist");
			
			System.out.println("Enter ur choice");
			
			
			switch(sc.nextInt())
			{
			case 1:
					System.out.println("Enter the String value in First Position");
					list.addFirst(sc.next());
					break;
					
			case 2:
					System.out.println("Enter the String value in Last Position");
					list.addLast(sc.next());
					break;
			case 3:
					System.out.println("Deleted First Element");
					list.deleteFirst();
					break;
			case 4:
				System.out.println("Deleted Last Element");
				list.deleteLast();
				break;
			case 5:
				System.out.println("Singal Link List is ->");
				list.printList();
				break;
					
			case 6:
				System.out.println("the Size of Single Linklist is -> "+list.getSize()); 
				break;
			case 7:
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


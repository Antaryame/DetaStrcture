package DS;

import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack st=new Stack();
		//queue qu=new queue(10);
		//insert_list list=new insert_list();
		//doubly_linkList dlist=new doubly_linkList();
		//Circular_linklist cl=new Circular_linklist();
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("Eenter one of the operation as following");
			System.out.println("\n<<<<<< menu >>>>>");
			System.out.println("\n 1.Stack");
			System.out.println("\n 2.Queue");
			System.out.println("\n 3.single LinkList ");
			System.out.println("\n 4.Duble LinkList");
			System.out.println("\n 5.circular LinkList");
			System.out.println("\n 6. Exist");
			
			System.out.println("Enter ur choice");
		
			
			switch(sc.nextInt())
			{
			case 1:
				Stack st=new Stack();
				Scanner a= new Scanner(System.in);
				
			do	
			{
				System.out.println("\n<<<<<< menu >>>>>");
				System.out.println("\n 1.push data");
				System.out.println("\n 2.pop data");
				System.out.println("\n 3.Display Stack");
				System.out.println("\n 4.peek of a data");
				System.out.println("\n 5. Display the Size");
				System.out.println("\n 6.Cheek Data is Empty");
				System.out.println("\n 7. Exist");
				System.out.println("Enter ur choice");
				
				
				switch(a.nextInt())
				{
				case 1:
						System.out.println("Enter the value");
						st.push(sc.nextInt());
						break;
						
				case 2:
						st.pop();
						break;
				case 3:
						st.Display();
				case 4:
						st.peek();
						break;
				case 5:
						System.out.println("The Size of Stack"+st.Size());
						break;
				case 6:
						st.isEmpty();
						break;
				case 7:
						System.exit(0);
					   return;
				default :
						
						System.out.println("Wrong Choice..........");
						break;
				}
				System.out.println("\n Do yuo want to continue press......2");
			}while(a.nextInt()==2);
			break;
			case 2:
				queue qu=new queue(10);
				Scanner b= new Scanner(System.in);
			do
			{
				
				
				System.out.println("\n<<<<<< menu >>>>>");
				System.out.println("\n 1.ADD data");
				System.out.println("\n 2.Delete data");
				System.out.println("\n 3.Display Queue");
				System.out.println("\n 4.Display Front");
				System.out.println("\n 5. Display the Size");
				System.out.println("\n 6.Cheek Data is Empty");
				System.out.println("\n 7. Exist");
				
				System.out.println("Enter ur choice");
				
				
				switch(b.nextInt())
				
				{
				case 1:
						System.out.println("Enter the value");
						qu.queuein(sc.nextInt());
						break;
						
				case 2:
						qu.queueout();
						break;
				case 3:
						qu.display();
				case 4:
						qu.qFront();
						break;
				case 5:
						System.out.println("The Size of Stack  "+qu.getsize());
						break;
				case 6:
						qu.isEmpty();
						break;
				case 7:
						System.exit(0);
				default :
						
						System.out.println("Wrong Choice..........");
						break;
				}
				System.out.println("\n Do yuo want to continue press......2");
			}while(b.nextInt()==2);
			break;
			case 3:
				insert_list list=new insert_list();
				Scanner c= new Scanner(System.in);
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
				
				
				switch(c.nextInt())
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
				System.out.println("\n Do yuo want to continue press......2");
			}while(c.nextInt()==2);
			break;
			
			case 4:
				doubly_linkList dlist=new doubly_linkList();
				Scanner d= new Scanner(System.in);
			{
				System.out.println("\n<<<<<< menu >>>>>");
				System.out.println("\n 1.Add NODE");
				System.out.println("\n 2.DELETE A NODE");
				System.out.println("\n 3. DISPLAY THE LINK LIST");
				System.out.println("\n 4. SIZE OF LINK LIST");
				System.out.println("\n 5. Exist");
				
				System.out.println("Enter ur choice");
				
				
				switch(d.nextInt())
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
				System.out.println("\n Do yuo want to continue press......2");
			}while(d.nextInt()==2);
			break;
			case 5:
				Circular_linklist cl=new Circular_linklist();
				Scanner e= new Scanner(System.in);
			do	
			{
				System.out.println("\n<<<<<< menu >>>>>");
				System.out.println("\n 1.Add data");
				System.out.println("\n 2.Display Circular Linked List");
				System.out.println("\n 3. Display the Size");
				System.out.println("\n 4. Exist");
				
				System.out.println("Enter ur choice");
				
				
				switch(e.nextInt())
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
					//System.exit(0);
					return;
					
				default :
						
						System.out.println("Wrong Choice..........");
						break;
				}
					System.out.println("\n Do yuo want to continue press......2");
				}while(e.nextInt()==2);
				break;
			default :
					
					System.out.println("Wrong Choice..........");
					break;
			}
			
			System.out.println("\n Do yuo want to continue press......1");
		}while(sc.nextInt()==1);

		
}


	}



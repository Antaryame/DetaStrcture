package DS;

import java.util.Scanner;

public class queue {
	public static int front,back,capacity;
	public static int queue[];
	private int size;
	
	queue(int size)
	{
		front=back=0;
		capacity=size;
		queue=new int [capacity];
		this.size=size=0;
	}
	public void queuein(int data)
	{
		if(capacity==back)
		{
			System.out.println("Queue is Full");
			return;
		}
		else 
			queue[back]=data;
		    back++;
		    size++;
			
	}
	public void queueout()
	{
		if(front == back)
		{
			System.out.println("Queue is empty");
		}
		else 
		{
			for(int i=0;i<=back;i++)
			{
				queue[i]=queue[i+1];
			}
			if(back<capacity)
			{
				queue[back]=0;
				back--;
				size--;
			}
		}
		return;
	}
	public void display()
	{
		int i;
		if(front==back)
		{
			System.out.println("Queue is Empty");
			return;
		} 
		for(i=front;i<back;i++)
		{
			System.out.print("["+queue[i]+"]");
		}
		return;
	}
	public void qFront()
	{
		if(front==back)
		{
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println( "this is a front of Queue"+"["+queue[front]+"]");
		return;
		
	}
  public void isEmpty()
	{
	   if(front==back)
		{
			System.out.println("Queue is Empty");
			return;
		}
	   else
	   {
		   System.out.println("\n Queue is not empty \n");
	   }
	}
  public int getsize()
  {
	  return size;
  }
}

/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		queue qu=new queue(10);
		
		Scanner sc= new Scanner(System.in);
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
			
			
			switch(sc.nextInt())
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
			System.out.println("\n Do yuo want to continue press......1");
		}while(sc.nextInt()==1);

		
	}

}*/

package DS;

import java.util.Scanner;

public class Stack {
	int stack []=new int[10];
	int top=0;
	public void push(int data)
	{
if(top==10)
		{
			System.out.println("Stack is full.......");
		}
		else 
		{
			stack[top]=data;
			top++;
		}
	}
	

	public int pop()
	{
		int data =0;
		
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			top--;
			data=stack[top];
			stack[top]=0;
		}
		return data;
	}
	public void Display()
	{
		for(int i:stack)
		{
			System.out.print("["+i+"]");
		}
	}
	public int peek()
	{
		int data;
		data=stack[top-1];
		System.out.println("the peek of the data"+data);
		return data;
		
	}
	public int Size()
	{
		return top;
	}
	public boolean isEmpty()
	{
		if(top<=0)
		{
			System.out.println("Stack is Empty");
		}
		return top<=0;
	}
}
	

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		
		Scanner sc= new Scanner(System.in);
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
			
			
			switch(sc.nextInt())
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
			default :
					
					System.out.println("Wrong Choice..........");
					break;
			}
			System.out.println("Do yuo want to continue press......1");
		}while(sc.nextInt()==1);

		
	}


}*/



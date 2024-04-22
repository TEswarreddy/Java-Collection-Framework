import java.util.*;
public class StackExample
{
	public static void main(String[] args)
	{
		Stack<Integer> obj=new Stack<Integer>();

		//push() -This method pushes an element from the Stack and returns it.
		obj.push(45);
		obj.push(65);
		obj.push(23);
		obj.push(1);
		obj.push(90);
		obj.push(84);
		obj.push(23);
	
		//peek()- this method returns the top most element in the Stock without removing it.
		System.out.println("Top element of the Stack is:"+obj.peek());

		//search() - this method returns the position of an element obj on to the top of the Stack or if the element is not found in the Stock then it returns -1.
		System.out.println("The position of the 23 is :"+obj.search(23));
		System.out.println("The position of the 99 is:"+obj.search(99));

		//pop()- this method deletes the top most element from the stack and returns it.
		System.out.println("the popped elemnt is:"+obj.pop());
		System.out.println("the popped elemnt is:"+obj.pop());
		System.out.println("the popped elemnt is:"+obj.pop());
		System.out.println("the popped elemnt is:"+obj.pop());

		//empty() - This method tests whether the stack is empty or not.if stock is Empty it returns True otherwise false.
		System.out.println("The stock is empty:"+obj.empty());

		System.out.println("the popped elemnt is:"+obj.pop());
		System.out.println("the popped elemnt is:"+obj.pop());
		System.out.println("the popped elemnt is:"+obj.pop());


		System.out.println("The stock is empty:"+obj.empty());

	}
}

//OUTPUT:
/*
Top element of the Stack is:23
The position of the 23 is :1
The position of the 99 is:-1
the popped elemnt is:23
the popped elemnt is:84
the popped elemnt is:90
the popped elemnt is:1
The stock is empty:false
the popped elemnt is:23
the popped elemnt is:65
the popped elemnt is:45
The stock is empty:true
*/

		
		

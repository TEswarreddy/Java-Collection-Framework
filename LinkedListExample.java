import java.util.*;
public class LinkedListExample
{
	public static void main(String[] args)
	{
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Kannayya");
		list1.add("Rukesh");
		list1.add("Rahul");
		list1.add("Kiran");
		list1.add("Mani");
		list1.add("Yeshu");
		list1.add("Rosi");
		list1.add("Hemanth");
		list1.add("Mahesh");
		list1.add("Vamsi");
		System.out.println("Initial list of elements in Linked list1:"+list1);
		System.out.println("Total number of Elements in Linked list1:"+list1.size());

		list1.remove("Kannayya");
		list1.remove("Vamsi");
		list1.remove("Mani");
		System.out.println("After invoking remove(object) method:"+list1);
		list1.remove(2);
		list1.remove(5);
		System.out.println("After invoking remove(index) method:"+list1);
		System.out.println("Total number of Elements in Linked list1:"+list1.size());


		LinkedList<String> list2=new LinkedList<String>();
		list2.add("Sarath");
		list2.add("Aanandh");
		list2.add("Puramdhamam");
		list2.add("Himalesh");
		System.out.println("Initial list of elements in Linked list2:"+list2);
		
		list1.addAll(list2);
		System.out.println("Updated Linked List1:");
		Iterator itr=list1.iterator();    //Iterator is a Interface
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Total number of Elements in Linked list1:"+list1.size());
		System.out.println("Tha Rahul elements there:"+list1.contains("Rahul"));
		System.out.println("The Linkedlist1 contains All elements of the list2:"+list1.containsAll(list2));
		
		System.out.println("The  Third element of the Linked list1 is:"+list1.get(2));
		System.out.println("first element of the LinkedList is:"+list1.getFirst());
		System.out.println("last element of the linkedlist is:"+list1.getLast());
		
		list1.removeFirst();
		System.out.println("After invoking the removeFirst() method:"+list1);

		list1.removeLast();
		System.out.println("Affter invoking the removeLast() method:"+list1);
		
		list1.set(3,"Manoj");
		list1.add(5,"Manoj");
		list1.addFirst("Manoj");
		list1.addLast("Manoj");
		System.out.println("After Updating the Linked list:"+list1);

		System.out.println("Index of the Manoj in linked list by Using indexOf():"+list1.indexOf("Manoj"));
		System.out.println("Index of the Manoj in linked list by Using lastIndexOf():"+list1.lastIndexOf("Manoj"));

		list1.removeAll(list2);
		System.out.println("Aftre removing list2 elements from list1:"+list1);
		System.out.println("Total number of Elements in Linked list1:"+list1.size());

		list1.clear();
		System.out.println("After invoking the clear() metod:"+list1);
		System.out.println("linked list1 is empty:"+list1.isEmpty());
		System.out.println("linked list2 is empty:"+list2.isEmpty());
	
	}
}

//OUTPUT:
/*
Initial list of elements in Linked list1:[Kannayya, Rukesh, Rahul, Kiran, Mani, Yeshu, Rosi, Hemanth, Mahesh, Vamsi]
Total number of Elements in Linked list1:10
After invoking remove(object) method:[Rukesh, Rahul, Kiran, Yeshu, Rosi, Hemanth, Mahesh]
After invoking remove(index) method:[Rukesh, Rahul, Yeshu, Rosi, Hemanth]
Total number of Elements in Linked list1:5
Initial list of elements in Linked list2:[Sarath, Aanandh, Puramdhamam, Himalesh]
Updated Linked List1:
Rukesh
Rahul
Yeshu
Rosi
Hemanth
Sarath
Aanandh
Puramdhamam
Himalesh
Total number of Elements in Linked list1:9
Tha Rahul elements there:true
The Linkedlist1 contains All elements of the list2:true
The  Third element of the Linked list1 is:Yeshu
first element of the LinkedList is:Rukesh
last element of the linkedlist is:Himalesh
After invoking the removeFirst() method:[Rahul, Yeshu, Rosi, Hemanth, Sarath, Aanandh, Puramdhamam, Himalesh]
Affter invoking the removeLast() method:[Rahul, Yeshu, Rosi, Hemanth, Sarath, Aanandh, Puramdhamam]
After Updating the Linked list:[Manoj, Rahul, Yeshu, Rosi, Manoj, Sarath, Manoj, Aanandh, Puramdhamam, Manoj]
Index of the Manoj in linked list by Using indexOf():0
Index of the Manoj in linked list by Using lastIndexOf():9
Aftre removing list2 elements from list1:[Manoj, Rahul, Yeshu, Rosi, Manoj, Manoj, Manoj]
Total number of Elements in Linked list1:7
After invoking the clear() metod:[]
linked list1 is empty:true
linked list2 is empty:false
*/

		
		


		

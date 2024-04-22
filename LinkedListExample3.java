import java.util.*;
public class LinkedListExample3
{
	public static void main(String[] args)
	{
		LinkedList list1=new LinkedList();
		list1.add(567);
		list1.add("Rukesh");
		list1.add(98.67);
		list1.add("Kiran");
		list1.add("Mani");
		list1.add(765);
		list1.add(32.33);
		list1.add("Hemanth");
		list1.add("Mahesh");
		list1.add(897.90);
		System.out.println("Initial list of elements in Linked list1:"+list1);
		System.out.println("Total number of Elements in Linked list1:"+list1.size());

		list1.remove("Mani");
		list1.remove(98.67);
		System.out.println("After invoking remove(object) method:"+list1);
		list1.remove(2);
		list1.remove(5);
		System.out.println("After invoking remove(index) method:"+list1);
		System.out.println("Total number of Elements in Linked list1:"+list1.size());


		LinkedList list2=new LinkedList();
		list2.add("Sarath");
		list2.add(3.456);
		list2.add(145);
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
		System.out.println("Tha Rahul elements there:"+list1.contains(32.33));
		System.out.println("The Linkedlist1 contains All elements of the list2:"+list1.containsAll(list2));
		
		System.out.println("The  Third element of the Linked list1 is:"+list1.get(2));
		System.out.println("first element of the LinkedList is:"+list1.getFirst());
		System.out.println("last element of the linkedlist is:"+list1.getLast());
		
		list1.removeFirst();
		System.out.println("After invoking the removeFirst() method:"+list1);

		list1.removeLast();
		System.out.println("Affter invoking the removeLast() method:"+list1);
		
		list1.set(3,"Manoj");
		list1.add(5,89.09);
		list1.addFirst(111);
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
/*Initial list of elements in Linked list1:[567, Rukesh, 98.67, Kiran, Mani, 765, 32.33, Hemanth, Mahesh, 897.9]
Total number of Elements in Linked list1:10
After invoking remove(object) method:[567, Rukesh, Kiran, 765, 32.33, Hemanth, Mahesh, 897.9]
After invoking remove(index) method:[567, Rukesh, 765, 32.33, Hemanth, 897.9]
Total number of Elements in Linked list1:6
Initial list of elements in Linked list2:[Sarath, 3.456, 145, Himalesh]
Updated Linked List1:
567
Rukesh
765
32.33
Hemanth
897.9
Sarath
3.456
145
Himalesh
Total number of Elements in Linked list1:10
Tha Rahul elements there:true
The Linkedlist1 contains All elements of the list2:true
The  Third element of the Linked list1 is:765
first element of the LinkedList is:567
last element of the linkedlist is:Himalesh
After invoking the removeFirst() method:[Rukesh, 765, 32.33, Hemanth, 897.9, Sarath, 3.456, 145, Himalesh]
Affter invoking the removeLast() method:[Rukesh, 765, 32.33, Hemanth, 897.9, Sarath, 3.456, 145]
After Updating the Linked list:[111, Rukesh, 765, 32.33, Manoj, 897.9, 89.09, Sarath, 3.456, 145, Manoj]
Index of the Manoj in linked list by Using indexOf():4
Index of the Manoj in linked list by Using lastIndexOf():10
Aftre removing list2 elements from list1:[111, Rukesh, 765, 32.33, Manoj, 897.9, 89.09, Manoj]
Total number of Elements in Linked list1:8
After invoking the clear() metod:[]
linked list1 is empty:true
linked list2 is empty:false
*/
		
		


		

import java.util.*;
public class LinkedListExample2
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		list1.add(54);
		list1.add(55);
		list1.add(66);
		list1.add(77);
		list1.add(88);
		list1.add(99);
		System.out.println("Initial list of elements in Linked list1:"+list1);
		System.out.println("Total number of Elements in Linked list1:"+list1.size());

		list1.remove(0);
		
		//System.out.println("After invoking remove(object) method:"+list1);
		list1.remove(2);
		list1.remove(5);
		System.out.println("After invoking remove(index) method:"+list1);
		System.out.println("Total number of Elements in Linked list1:"+list1.size());


		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		list2.add(444);
		System.out.println("Initial list of elements in Linked list2:"+list2);
		
		list1.addAll(list2);
		System.out.println("Updated Linked List1:");
		Iterator itr=list1.iterator();    //Iterator is a Interface
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Total number of Elements in Linked list1:"+list1.size());
		System.out.println("Tha Rahul elements there:"+list1.contains(22));
		System.out.println("The Linkedlist1 contains All elements of the list2:"+list1.containsAll(list2));
		
		System.out.println("The  Third element of the Linked list1 is:"+list1.get(2));
		System.out.println("first element of the LinkedList is:"+list1.getFirst());
		System.out.println("last element of the linkedlist is:"+list1.getLast());
		
		list1.removeFirst();
		System.out.println("After invoking the removeFirst() method:"+list1);

		list1.removeLast();
		System.out.println("Affter invoking the removeLast() method:"+list1);
		
		list1.set(3,150);
		list1.add(5,200);
		list1.addFirst(300);
		list1.addLast(150);
		System.out.println("After Updating the Linked list:"+list1);

		System.out.println("Index of the 150 in linked list by Using indexOf():"+list1.indexOf(150));
		System.out.println("Index of the 150 in linked list by Using lastIndexOf():"+list1.lastIndexOf(150));

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
Initial list of elements in Linked list1:[11, 22, 33, 54, 55, 66, 77, 88, 99, 0]
Total number of Elements in Linked list1:10
After invoking remove(object) method:[22, 33, 54, 55, 66, 77, 88, 99, 0]
After invoking remove(index) method:[22, 33, 55, 66, 77, 99, 0]
Total number of Elements in Linked list1:7
Initial list of elements in Linked list2:[111, 222, 333, 444]
Updated Linked List1:
22
33
55
66
77
99
111
222
333
444
Total number of Elements in Linked list1:11
Tha Rahul elements there:true
The Linkedlist1 contains All elements of the list2:true
The  Third element of the Linked list1 is:55
first element of the LinkedList is:22
last element of the linkedlist is:444
After invoking the removeFirst() method:[33, 55, 66, 77, 99, 0, 111, 222, 333, 444]
Affter invoking the removeLast() method:[33, 55, 66, 77, 99, 0, 111, 222, 333]
After Updating the Linked list:[300, 33, 55, 66, 150, 99, 200, 0, 111, 222, 333, 150]
Index of the 150 in linked list by Using indexOf():4
Index of the 150 in linked list by Using lastIndexOf():11
Aftre removing list2 elements from list1:[300, 33, 55, 66, 150, 99, 200, 0, 150]
Total number of Elements in Linked list1:9
After invoking the clear() metod:[]
linked list1 is empty:true
linked list2 is empty:false
*/	
	
		
		


		

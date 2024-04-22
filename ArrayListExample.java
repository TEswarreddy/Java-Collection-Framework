import java.util.*;
public class ArrayListExample
{
	public static void main(String[] args)
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		
		System.out.println("Array list 1 elemnts are:");
		Iterator itr1=list1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("Size of the Array list1:"+list1.size());


		ArrayList<String> list2=new ArrayList<String>();
		list2.add("orange");
		list2.add("Gova");
		list2.add("Neredu");
		list2.add("pineapple");
		System.out.println("Array list2 elemnts are:");
		Iterator itr2=list2.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println("Size of the Array list2:"+list2.size());

		list1.addAll(list2);
		itr1=list1.iterator();
		System.out.println("After adding tha list2 elements into list1 :");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("Size of the Array list1:"+list1.size());
		System.out.println("The Array list2 elements are there in Array list1:"+list1.containsAll(list2));
		
		list1.remove("Apple");
		list1.remove("Neredu");
		System.out.println("After removing an objects list1 elements are:\n"+list1);
	
		System.out.println("Size of the Array list1:"+list1.size());
		
		System.out.println("The Apple elment is there(True/false):"+list1.contains("Apple"));
		System.out.println("The Banana elment is there(True/false):"+list1.contains("Banana"));
		System.out.println("The Array list2 elements are there in Array list1:"+list1.containsAll(list2));
		
		list1.removeAll(list2);
		System.out.println(" after removing list2 elements from list1 elements:"+list1);
		System.out.println("Size of the Array list1:"+list1.size());
		
	   	 list2.clear();
		System.out.println("after clearing all elements in Array list2:"+list2);
	   	 System.out.println("list2 is empty?:"+list2.isEmpty());
	    
	   	 list1.set(1,"Apple");
	    	System .out.println("After Apple element setted into 1 specified position:"+list1);
	    	list1.add("Apple");
	    	System.out.println("Array list is:"+list1);
	    	System.out.println("Index of the Apple element is:"+list1.indexOf("Apple"));
	    	 System.out.println("Index of the Apple element from Backward or lost to first is:"+list1.lastIndexOf("Apple"));
	}
}
//OUTPUT:-
/*Array list 1 elemnts are:
Mango
Apple
Banana
Grapes
Size of the Array list1:4
Array list2 elemnts are:
orange
Gova
Neredu
pineapple
Size of the Array list2:4
After adding tha list2 elements into list1 :
Mango
Apple
Banana
Grapes
orange
Gova
Neredu
pineapple
Size of the Array list1:8
The Array list2 elements are there in Array list1:true
After removing an objects list1 elements are:
[Mango, Banana, Grapes, orange, Gova, pineapple]
Size of the Array list1:6
The Apple elment is there(True/false):false
The Banana elment is there(True/false):true
The Array list2 elements are there in Array list1:false
 after removing list2 elements from list1 elements:[Mango, Banana, Grapes]
Size of the Array list1:3
after clearing all elements in Array list2:[]
list2 is empty?:true
After Apple element setted into 1 specified position:[Mango, Apple, Grapes]
Array list is:[Mango, Apple, Grapes, Apple]
Index of the Apple element is:1
Index of the Apple element from Backward or lost to first is:3
*/

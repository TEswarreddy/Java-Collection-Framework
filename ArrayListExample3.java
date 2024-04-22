import java.util.*;
public class ArrayListExample3
{
	public static void main(String[] args)
	{
		ArrayList list1=new ArrayList();
		list1.add(1);
		list1.add("Rosi");
		list1.add(2);
		list1.add("Kiran");
		list1.add("Hemmani");
		
		System.out.println("Array list 1 elemnts are:"+list1);
		
		System.out.println("Size of the Array list1:"+list1.size());


		ArrayList list2=new  ArrayList();
		list2.add(3.5);
		list2.add("Rukesh");
		list2.add(4.70);
		list2.add("Rahul");
		System.out.println("Array list2 elemnts are:"+list2);
		
		System.out.println("Size of the Array list2:"+list2.size());

		list1.addAll(list2);
		System.out.println("After adding tha list2 elements into list1 :");
		Iterator itr=list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Size of the Array list1:"+list1.size());
		System.out.println("The Array list2 elements are there in Array list1:"+list1.containsAll(list2));
		
		list1.remove(3.5);
		list1.remove("Rukesh");
		System.out.println("After removing an objects list1 elements are:\n"+list1);
	
		System.out.println("Size of the Array list1:"+list1.size());
		
		System.out.println("The Apple elment is there(True/false):"+list1.contains(1));
		System.out.println("The Banana elment is there(True/false):"+list1.contains(3.5));
		System.out.println("The Array list2 elements are there in Array list1:"+list1.containsAll(list2));
		
		list1.removeAll(list2);
		System.out.println(" after removing list2 elements from list1 elements:"+list1);
		System.out.println("Size of the Array list1:"+list1.size());
		
	    list2.clear();
		System.out.println("after clearing all elements in Array list2:"+list2);
	    System.out.println("list2 is empty?:"+list2.isEmpty());
	    
	    list1.set(0,7.9);
	    System .out.println("After Apple element setted into 1 specified position:"+list1);
	    list1.add(7.9);
	    System.out.println("Array list is:"+list1);
	    System.out.println("Index of the Apple element is:"+list1.indexOf(7.9));
	     System.out.println("Index of the Apple element from Backward or lost to first is:"+list1.lastIndexOf(7.9));
	}
}
//OUTPUT:
/*
Array list 1 elemnts are:[1, Rosi, 2, Kiran, Hemmani]
Size of the Array list1:5
Array list2 elemnts are:[3.5, Rukesh, 4.7, Rahul]
Size of the Array list2:4
After adding tha list2 elements into list1 :
1
Rosi
2
Kiran
Hemmani
3.5
Rukesh
4.7
Rahul
Size of the Array list1:9
The Array list2 elements are there in Array list1:true
After removing an objects list1 elements are:
[1, Rosi, 2, Kiran, Hemmani, 4.7, Rahul]
Size of the Array list1:7
The Apple elment is there(True/false):true
The Banana elment is there(True/false):false
The Array list2 elements are there in Array list1:false
 after removing list2 elements from list1 elements:[1, Rosi, 2, Kiran, Hemmani]
Size of the Array list1:5
after clearing all elements in Array list2:[]
list2 is empty?:true
After Apple element setted into 1 specified position:[7.9, Rosi, 2, Kiran, Hemmani]
Array list is:[7.9, Rosi, 2, Kiran, Hemmani, 7.9]
Index of the Apple element is:0
Index of the Apple element from Backward or lost to first is:5
*/

	

import java.util.*;
public class ArrayListExample2
{
	public static void main(String[] args)
	{
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		
		System.out.println("Vector v1 elemnts are:"+v1);
		
		System.out.println("Size of the vector v1 or Total no.of elements in v1:"+v1.size());


		Vector<Integer> v2=new Vector<Integer>();
		v2.add(5);
		v2.add(6);
		v2.add(7);
		v2.add(8);
		System.out.println("ve2 elemnts are:"+v2);
		
		System.out.println("Size of the v2 or total elements in the v2 is:"+v2.size());

		v1.addAll(v2);
		System.out.println("After adding tha v2 elements into v1 :");
		Iterator itr=v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Size of the Vector or total no of elements in the :"+v1.size());
		System.out.println("The vector v2 elements are there in vector v1:"+v1.containsAll(v1));
		
		list1.remove(1);
		list1.remove(5);
		System.out.println("After removing an objects from v1 elements are:\n"+v1);
	
		System.out.println("Size of the vector v1 or total elements on the vector v1 is:"+v1.size());
		
		System.out.println("The 1 elment is there(True/false):"+v1.contains(1));
		System.out.println("The 3 elment is there(True/false):"+v1.contains(3));
		System.out.println("The  vector v2 elements are there in Array list1:"+v11.containsAll(v2));
		
		v1.removeAll(v2);
		System.out.println(" after removing list2 elements from list1 elements:"+list1);
		System.out.println("Size of the Array list1:"+list1.size());
		
	    list2.clear();
		System.out.println("after clearing all elements in vector v1 list2:"+list2);
	    System.out.println("list2 is empty?:"+list2.isEmpty());
	    
	    list1.set(0,1);
	    System .out.println("After 1 element setted into 0 specified position:"+list1);
	    list1.set(1,1);
	    System.out.println("vector v1 is:"+list1);
	    System.out.println("Index of the 1 element is:"+list1.indexOf(1));
	     System.out.println("Index of the 1 element from Backward or lost to first is:"+list1.lastIndexOf(1));
	}
}
//OUTPUT:
/*
Array list 1 elemnts are:[1, 2, 3, 4]
Size of the Array list1:4
Array list2 elemnts are:[5, 6, 7, 8]
Size of the Array list2:4
After adding tha list2 elements into list1 :
1
2
3
4
5
6
7
8
Size of the Array list1:8
The Array list2 elements are there in Array list1:true
After removing an objects list1 elements are:
[1, 3, 4, 5, 6, 8]
Size of the Array list1:6
The 1 elment is there(True/false):true
The 3 elment is there(True/false):true
The Array list2 elements are there in Array list1:false
 after removing list2 elements from list1 elements:[1, 3, 4]
Size of the Array list1:3
after clearing all elements in Array list2:[]
list2 is empty?:true
After Apple element setted into 1 specified position:[1, 3, 4]
Array list is:[1, 1, 4]
Index of the 1 element is:0
Index of the 1 element from Backward or lost to first is:1
*/

import java.util.*;
public class ArrayListExample2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		System.out.println("Array list 1 elemnts are:"+list1);
		
		System.out.println("Size of the Array list1:"+list1.size());


		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
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
		
		list1.remove(1);
		list1.remove(5);
		System.out.println("After removing an objects list1 elements are:\n"+list1);
	
		System.out.println("Size of the Array list1:"+list1.size());
		
		System.out.println("The 1 elment is there(True/false):"+list1.contains(1));
		System.out.println("The 3 elment is there(True/false):"+list1.contains(3));
		System.out.println("The Array list2 elements are there in Array list1:"+list1.containsAll(list2));
		
		list1.removeAll(list2);
		System.out.println(" after removing list2 elements from list1 elements:"+list1);
		System.out.println("Size of the Array list1:"+list1.size());
		
	    list2.clear();
		System.out.println("after clearing all elements in Array list2:"+list2);
	    System.out.println("list2 is empty?:"+list2.isEmpty());
	    
	    list1.set(0,1);
	    System .out.println("After 1 element setted into 1 specified position:"+list1);
	    list1.set(1,1);
	    System.out.println("Array list is:"+list1);
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
After 1 element setted into 1 specified position:[1, 3, 4]
Array list is:[1, 1, 4]
Index of the 1 element is:0
Index of the 1 element from Backward or lost to first is:1
*/


//In is also possible access the each elemet in ArrayList by using "for loop".
/* for(int i=0;i<arraylist1.size();i++)
	{
		int temp=arraylist1.get(i);
		System.out.println(temp);
	}
*/

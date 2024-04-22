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
		
		System.out.println("The Apple elment is there(True/false):"+list1.contains(1));
		System.out.println("The Banana elment is there(True/false):"+list1.contains(3));
		System.out.println("The Array list2 elements are there in Array list1:"+list1.containsAll(list2));
		
		list1.removeAll(list2);
		System.out.println(" after removing list2 elements from list1 elements:"+list1);
		System.out.println("Size of the Array list1:"+list1.size());
		
	    list2.clear();
		System.out.println("after clearing all elements in Array list2:"+list2);
	    System.out.println("list2 is empty?:"+list2.isEmpty());
	    
	    list1.set(0,1);
	    System .out.println("After Apple element setted into 1 specified position:"+list1);
	    list1.set(1,1);
	    System.out.println("Array list is:"+list1);
	    System.out.println("Index of the Apple element is:"+list1.indexOf(1));
	     System.out.println("Index of the Apple element from Backward or lost to first is:"+list1.lastIndexOf(1));
	}
}
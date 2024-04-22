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
		System.out.println("After removing an objects list1 elements are:");
		itr1=list1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("Size of the Array list1:"+list1.size());
		
		System.out.println("The Apple elment is there(True/false):"+list1.contains("Apple"));
		System.out.println("The Banana elment is there(True/false):"+list1.contains("Banana"));
		System.out.println("The Array list2 elements are there in Array list1:"+list1.containsAll(list2));
		
		
	
	}
}
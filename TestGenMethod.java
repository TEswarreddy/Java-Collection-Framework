class GenMethod
{
	static <T>void display(T[] arr)
	{
		for(T var:arr)
		{
			System.out.println(var);
		}
	}
}
class TestGenMethod
{
	public static void main(String[] args)
	{
		Integer ar1[]={1,2,3,4,5,6};
		GenMethod.display(ar1);
		
		String ar2[]={"eswar","hen","kir"};
		GenMethod.display(ar2);
		
		 Double ar3[]={2.2,1.2,3.3,4.4,5.5};
		GenMethod.display(ar3);
		
	
	}
}

		
		
//Before going to the collection frame work we must understand about Generics and Implementation
class Generic<T>
{
	T var;
	Generic1(T var)
	{
		this.var=var;
	}
	T display()
	{
		return var;
	}
}
class GenericClass
{
	public static void main(String[] args)
	{
		int i=78;
		Generic1<Integer> obj1=new Generic1<Integer>(i);
		System.out.println(obj1.display());
		float f=7.8008f;
		Generic1<Float> obj2=new Generic1<Float>(f);
		System.out.println(obj2.display());
		String s="generic";
		Generic1<String> obj3=new Generic1<String>(s);
		System.out.println(obj3.display());

	}
}

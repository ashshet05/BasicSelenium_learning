package com.learning.libraries;
class Person
{
	
}
class Fake
{
	public int hashCode()
	{
		return 87787;
	}
}

public class HashCodeMethodObjectClass 
{

	public static void main(String[] args) 
	{
		Person p1=new Person();//this Person object has hash code value by default once x-created as it belongs to object class(java.lang package)
		System.out.println(p1.hashCode());//to the hash code value call the method
		
		Fake f1=new Fake();
		System.out.println(f1.hashCode());

	}

}

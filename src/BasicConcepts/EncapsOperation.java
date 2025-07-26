package BasicConcepts;

import java.nio.file.spi.FileSystemProvider;

public class EncapsOperation 
{
	private String name;
	private int size;
	private float location;
	
	EncapsOperation(String name,int size,float location)
	{
		this.name=name;
		this.size=size;
		this.location=location;
	}
	
	public String getName()
	{
		System.out.println("get access and validate name");
		return name;
	}
	public int getSize()
	{
		System.out.println("get access and validate size");
		return size;
	}
	public float getLocation()
	{
		System.out.println("get access and validate location");
		return location;
	}
	
	public void setName(String name)
	{
		name=name;
		System.err.println("Name updated successfully");
	}
	public void setLocation(float loc)
	{
		location=loc;
		System.out.println("Location set successfully:" +location);
	}
}

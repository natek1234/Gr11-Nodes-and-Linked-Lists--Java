//Author: Ketan Vasudeva
//Date: November 9th, 2016
//Purpose: Creates object arrays.
public class ArraySet implements iSet {

	//Declares member variables.
	Object[] array;
	
	//Initializes class's variables.
	public ArraySet()
	{
		array = new Object[1];
	}
	
	//Adds an object to the array.
	public void add(Object item) {
		
		//Creates an array that is one larger than the original.
		Object[] temp = new Object[size() + 2];
		
		//Copies all the objects over to the new array.
		for(int count = 0; count < size(); count++)
		{
			temp[count] = array[count];
		}
			
		//Sets the first position equal to the object if there are no objects in the array.
		if(size() == 0)
		{
			temp[0] = item;
		}
		//Sets the last position equal to the object.
		else
		{
			temp[size()] = item;
		}
		
		//Sets the array equal to temp.
		array = temp;
		
	}

	//Removes an object from the array.
	public void remove(Object item) {
		
		//Exits if item is not in array.
		if(!contains(item))
		{
			return;
		}
		else if (size() == 1)
		{
			array[0] = null;
			return;
		}
		
		//Creates a temp array of size 1 less than the original and a counter to transfer contents over.
		Object[] temp = new Object[size()];
		int counter = 0;
		
		//Loops through, finding object being searched for and setting it to null.
		for(int count = 0; count < size(); count++)
		{
			if(item.equals(array[count]))
			{
				array[count] = null;
			}
		}
		
		//Copies over all non null objects to the new array.
		for(int count = 0; count < size() + 1; count++)
		{
			if(array[count] != null)
			{
				temp[counter] = array[count];
				counter++;
			}
		}
		
		//Sets array equal to temp array.
		array = temp;

	}

	//Returns size of array.
	public int size() {
		//If first position is null, then size is 0;
		if(array.length == 1)
		{
			return 0;
		}
		//Otherwise returns the actual length of array.
		else
		{
			return array.length-1;
		}
	}

	//Returns if an object is contained in the array.
	public boolean contains(Object item) 
	{
		//Loops through array and returns true if object is found.
		for(int count = 0; count < size(); count++)
		{
			if(item.equals(array[count]))
			{
				return true;
			}
		}
		
		//Return false if object not found.
		return false;
			
	}

}

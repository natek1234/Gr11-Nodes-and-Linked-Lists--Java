//Author: Ketan Vasudeva
//Date: November 9th, 2016
//Purpose: Create a linked list class.
public class LLSet implements iSet {

	// Member Variables
	private Node head;
	
	//Initializer
	public LLSet() 
	{
		head = null;
	}
	
	//Adds an object to the list.
	public void add(Object item) {
		// Head is null meaning no items are in the list.
		// We'll set the head to equal a new node containing this item.
		if (head == null) {
			head = new Node(item);
		}
		else {
			// Stuff is in the list. Let's find the last node in the list.
			Node temp = head; // point to the front.
			
			// As long as there's another node in the list....
			while (temp.getNext() != null) 
			{
				temp = temp.getNext(); // move the reference over.
			}
			
			// temp now points to the last node in the list.
			Node n = new Node(item);
			temp.setNext(n);
		}

	}

	//Removes an object from the list.
	public void remove(Object item) 
	{

		//Returns if object not contained in list.
		if(contains(item) == false)
		{
			return;
		}
		//Checks if head is item.
		else if(head.getItem().equals(item))
		{
			head = head.getNext();
		}
		//Checks the rest of the array.
		else {
			Node temp = head; // point to the front.
			
			//Checks if the current position's next is the item to be removed (in the node).
			while (!temp.getNext().getItem().equals(item)) 
			{
				temp = temp.getNext(); // move the reference over.
			}
			
			//Set's the current position's next to skip over the item to be removed (skips over node)
			temp.setNext((temp.getNext()).getNext());
			
		}

	}
	
	//Returns size of list.
	public int size()
	{
		//If head has no value, list is empty.
		if(head == null)
		{
			return 0;
		}
		Node temp = head; // point to the front.
		//Starts count at 1 since head exists.
		int count = 1;

		// As long as there's another node in the list....
		while (temp.getNext() != null) 
		{
			//Count increases by one till the end of the list.
			temp = temp.getNext(); // move the reference over.
			count++;
		}
		
		//Return size.
		return count;

	}
	
	//Returns if an object is in the list.
	public boolean contains(Object item) 
	{
		//Cannot contain if size is 0 (head is null)
		if(head == null)
		{
			return false;
		}
		//Checks if head is object.
		else if (head.getItem().equals(item))
		{
			return true;
		}
		Node temp = head; // point to the front.

		// As long as there's another node in the list....
		while (temp.getNext() != null) 
		{
			//Checks if the next of the current node contains the object.
			if(temp.getNext().getItem().equals(item))
			{
				return true;
			}
			temp = temp.getNext(); // move the reference over.
		}
		//Returns false if not found.
		return false;
	}

}

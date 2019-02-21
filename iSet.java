public interface iSet {

// precondition: item is not null
// postcondition: adds the item into the set if it’s not already in it    
public void add(Object item);
// precondition: item is not null
// postcondition: removes the item from the set if it exists     
public void remove(Object item);
// precondition: none
// postcondition: returns the number of items in the set 
public int size();
// precondition: item is not null
// postcondition: returns true if and only if item is in the set    
public boolean contains(Object item);
}; 

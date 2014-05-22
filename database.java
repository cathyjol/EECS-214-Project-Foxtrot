/*
 * Classes
 * EECS 214 Project Foxtrot
 * Movie database
 */

package finalproject;


// Sorted by movie title, from a to z ignoring case.
public class database
{

  protected int numElements;      // number of elements in this list
  protected LLNode currentPos; // current position for iteration

  // set by find method
  protected boolean found;        // true if element found, else false
  protected LLNode location;   // node containing element, if found
  protected LLNode previous;   // node preceeding location

  protected LLNode list;       // first node on the list

  public database()
  {
    numElements = 0;
    list = null;
    currentPos = null;
  }

  public void add(movie element)
  // Adds element to this list.
  {
    LLNode prevLoc;        // trailing reference
    LLNode location;       // traveling reference
    movie listElement;            // current list element being compared      

    // Set up search for insertion point.
    location = list;
    prevLoc = null;

    // Find insertion point.
    while (location != null)
    {
      listElement = location.getInfo();
      if (listElement.compareToTitle(element) < 0)  // list element < add element
      {
         prevLoc = location;
         location = location.getLink();
      }
      else
        break;
    }

    // Prepare node for insertion.
    LLNode newNode = new LLNode(element);

    // Insert node into list.
    if (prevLoc == null)         
    {
      // Insert as first node.
      newNode.setLink(list);
      list = newNode;
    }
    else
    {
      // Insert elsewhere.
      newNode.setLink(location);
      prevLoc.setLink(newNode);
    }
    numElements++;
  }


  protected void find(movie target)
  // Searches list for an occurence of an element e such that
  // e.equals(target). If successful, sets instance variables
  // found to true, location to node containing e, and previous
  // to the node that links to location. If reach a point containing 
  // a element lager than target element, there is not a match.If not 
  // successful, sets found to false.
  {
    location = list;
    found = false;

    while (location != null) 
    {
      if (location.getInfo().compareToTitle(target) == 0)  // if they match
      {
       found = true;
       return;
      }
	  else if(location.getInfo().compareToTitle(target) == 1)
	  {
		return;
	  }
      else
      {
        previous = location;
        location = location.getLink();
      }
    }
  }

  public int size()
  // Returns the number of elements on this list. 
  {
    return numElements;
  }

  public boolean contains (movie element)
  // Returns true if this list contains an element e such that 
  // e.equals(element); otherwise, returns false.
  {
    find(element);
    return found;
  }

  public boolean remove (movie element)
  // Removes an element e from this list such that e.equals(element)
  // and returns true; if no such element exists, returns false.
  {
    find(element);
    if (found)
    {
      if (list == location)     
        list = list.getLink();    // remove first node
      else
        previous.setLink(location.getLink());  // remove node at location

      numElements--;
    }
    return found;
  }

  public movie get(movie element)
  // Returns an element e from this list such that e.equals(element);
  // if no such element exists, returns null.
  {
    find(element);    
    if (found)
      return location.getInfo();
    else
      return null;
  }
  
  public String toString()
  // Returns a nicely formatted string that represents this list.
  {
    LLNode currNode = list;
    String listString = "List:\n";
    while (currNode != null)
    {
      listString = listString + "  " + currNode.getInfo().toString() + "\n";
      currNode = currNode.getLink();
    }
    return listString;
  }  

  public void reset()
  // Initializes current position for an iteration through this list,
  // to the first element on this list.
  {
    currentPos  = list;
  }

  public movie getNext()
  // Preconditions: The list is not empty
  //                The list has been reset
  //                The list has not been modified since most recent reset
  //
  // Returns the element at the current position on this list.
  // If the current position is the last element, then it advances the value 
  // of the current position to the first element; otherwise, it advances
  // the value of the current position to the next element.
  {
    movie next = currentPos.getInfo();
    if (currentPos.getLink() == null)
      currentPos = list;
    else
      currentPos = currentPos.getLink();
    return next;
  }
}

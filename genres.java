/*
 * Classes
 * EECS 214 Project Foxtrot
 * Movie database
 */

package foxtrot;

/*
 * Will be limited number of pre-determined genres,
 * each referencing movies within unsorted list of movies in database
 * TO be organized by movies' average rating (high to low)
 */

public class genres implements GenresInterface {
    public String title;
    protected int numMovies; // Number of movies within genre list
    protected movie topRanked; // Top movie within genre list
    protected LLNode currentPos; // current position for iteration
  // set by find method
  protected boolean found;        // true if element found, else false
  protected LLNode location;   // node containing element, if found
  protected LLNode previous;   // node preceeding location

  protected LLNode list;       // first node on the list
    
    public genres() {
        numMovies = 0;
        topRanked = null;
        list = null;
    }
    
    // Adds new movie to this list by iterating through list and invoking .compareTo() method
    // to determing where to position new movie within genre list
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
      if (listElement.compareToRank(element) > 0)  // list element > add element
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
    numMovies++;
  }
      
    public void search(movie target)
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
      else
      {
        previous = location;
        location = location.getLink();
      }
    }
  }
      
     public boolean contains(movie element) {
        search(element);
        return found;
    }
    
     public void reset() {
        currentPos = list;
    }

    /* Preconditions: The list is not empty
     *                The list has been reset
     * Returns the element at the top position on genre list
     * If user does not want to watch this movie, returns next-highest rated movie
     */
     public movie getSuggestion() {
        reset();
        topRanked = currentPos.getInfo();
        currentPos = currentPos.getLink();
        return topRanked;
    }
     
     public movie getNext()
  // Preconditions: The list is not empty
  //                The list has been reset
  //                The list has not been modified since most recent reset
  // If user does not want to watch this movie, returns next-highest rated movie
  {
    movie next = currentPos.getInfo();
    if (currentPos.getLink() == null)
      currentPos = list;
    else
      currentPos = currentPos.getLink();
    return next;
  }
     
}

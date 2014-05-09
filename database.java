/*
 * Classes
 * EECS 214 Project Foxtrot
 * Movie database
 */
 
package foxtrot;

public class database implements ListsInterface {
    /*
     * Database used to check for already-existing movies,
     * versus checking in genres, where a movie may be present in multiple
     */
    protected node database; // Beginning of movie database
    public int sizeOfDatabase; // Number of movies in database

    @Override public void add(movie u) {
        
    }

    @Override public boolean contains(movie u) {
        return false;
    }
    
    @Override public void search(movie u) {
    /*
     * We need a case here that will check our movie results that are close to what you searched.
     */
    
    }
    
}

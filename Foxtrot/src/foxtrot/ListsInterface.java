/*
 * Interfaces
 * EECS 214 Project Foxtrot
 * Movie database
 */

package foxtrot;

public interface ListsInterface {
    // Adds new movie to this list
    void add(movie u);
    
    // Returns true if this list contains a movie u, such that
    // movie.equals(u); otherwise returns false
    boolean contains(movie u);
}
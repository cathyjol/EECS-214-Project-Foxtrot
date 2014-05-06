/*
 * Interfaces
 * EECS 214 Project Foxtrot
 * Movie database
 */

package foxtrot;

public interface GenresInterface extends ListsInterface {
    // Sets position to zero for iteration through genre list,
    // such that each visit to the genre will begin with its most higly rated movie
    void reset();
    
    // Preconditions: The list is not empty
    //                The list has been reset
    // Returns the element at the top position on genre list
    // If user does not want to watch this movie, returns next-highest rated movie
    movie getSuggestion();
}

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
    protected node topRanked; // Top movie within genre list
    
    public genres() {
        numMovies = 0;
        topRanked = null;
    }
    
    // Adds new movie to this list by iterating through list and invoking .compareTo() method
    // to determing where to position new movie within genre list
    @Override public void add(movie u) {
        
    }
    
    @Override public boolean contains(movie u) {
        return false;
    }
    
    @Override public void reset() {
        
    }

    /* Preconditions: The list is not empty
     *                The list has been reset
     * Returns the element at the top position on genre list
     * If user does not want to watch this movie, returns next-highest rated movie
     */
    @Override public movie getSuggestion() {
        return topRanked.info;
    }
}
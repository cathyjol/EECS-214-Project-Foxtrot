/*
 * Classes
 * EECS 214 Project Foxtrot
 * Movie database
 */

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
    void add(movie u);
    
}
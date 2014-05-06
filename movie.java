/*
 * Classes
 * EECS 214 Project Foxtrot
 * Movie database
 */

public class movie implements MovieInterface {
    public String title; // Title of the movie
    public float rating; // Review-averaged rating
    public int numRatings; // Number of times movie has been reviewed by users
    public String genreList[3]; // List (maximum of 3) of movie's genres
    
    // Constructor method
    public movie {
        title = null;
        rating = 0.0;
        numRatings = 0;
    }
    
    
    // Returns string of movie (includes title, genre, rating and # reviews)
    public String toString();
    
    // Iterates through movie's array of genres
    // and adds reference to itself within appropriate genres
    public void addToGenre() {
        /*
         * Accessing this.genreList[], iterates through pre-determined genre titles
         * and if (genre.title).equals(this.genreList[i]) (i.e. a genre within the movie's genre array
         * matches a genre within our pre-determined set, the genres.add(this) will be invoked
         */
        
    }
    
    public void setRating(int rating) {
        // 
    }
    
    // Iterates through list of movies within a genre to compare this movie's rating,
    // such that its ranking can be determined relative to other movie's average ratings
    public int compareTo(movie opponent) {
        /*
         * If this.rating > opponent.rating, position this movie before opponent in list
         * If this.rating < opponent.rating, position this movie after opponent in list
         * If this.rating == opponent.rating, position this movie before opponent in list
         */
        return 0;
    }
}
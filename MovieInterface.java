/*
 * Interfaces
 * EECS 214 Project Foxtrot
 * Movie database
 */

public interface MovieInterface {
    // Sets title of movie
    void setTitle(String title);
    
    // Sets rank according to type
    // A review object directly takes the input while
    // a movie object adjusts its average rating
    void setRating(int rating);
    
    // Adds genre to a movie's genre list (maximum of 3)
    void addGenre(String genre);
}
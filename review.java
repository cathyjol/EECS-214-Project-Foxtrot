/*
 * Classes
 * EECS 214 Project Foxtrot
 * Movie database
 */

public class review implements MovieInterface {
    public String title; // Title of the movie
    public int rating; // User rating
    public genres genreList[3]; // List (maximum of 3) of movie's genres
    protected node location; // Node containing movie reviewed, if already in database
    
    
}
/*
 * Classes
 * EECS 214 Project Foxtrot
 * Movie database
 */

package foxtrot;

public class review {
    public String title; // Title of the movie
    private int rating; // User rating
    public String[] genreList; // List (maximum of 3) of movie's genres
    public userProfile critic;
    private int recommends;
    protected node location; // Node containing movie reviewed, if already in database
    
    public review(String u, userProfile edit) {
        title = u;
        critic = edit;
        genreList = new String[3];
    }
    
    // Sets review rating
    public void setRating(int rate) {
        rating = rate;
    }
    
    // Gets review rating
    public int getRating() {
        return rating;
    }
    
    // Sets review genres
    public void setGenres(String first, String second, String third) {
        genreList[0] = first;
        genreList[1] = second;
        genreList[2] = third;
    }

    // Sets review recommendation
    public void setRecommends(int ok) {
        recommends = ok;
    }
    
    // Gets review recommendation
    public int getRecommends() {
        return recommends;
    }
    
    public boolean movieObject(String k) {
        /* 
         * Iterates through movie database list to compare all titles with string k
         * If movie already exists, return true; otherwise, return false
         */
        return false;
    }
}
/*
 * Classes
 * EECS 214 Project Foxtrot
 * Movie database
 */

public class userProfile {
    private String username; // Name of user
    public node reviews; // First review created by user
    public node mostRecentlyWatched; // Last movie reviewed by user
    public int numReviews; // Number of reviews created by user
    
    public userProfile (String name) {
        username = name;
        reviews = null;
        mostRecentlyWatched = null;
        numReviews = 0;
    }
    
    // Creates link within profile to new movie review created by user
    public void newReview();
}
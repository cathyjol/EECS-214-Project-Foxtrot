/*
 * Classes
 * EECS 214 Project Foxtrot
 * Movie database
 */

package foxtrot;

public class userProfile {
    public final String username; // Name of user
    private String password;
    public node reviews; // First review created by user
    public node mostRecentlyWatched; // Last movie reviewed by user
    public int numReviews; // Number of reviews created by user
    
    public userProfile (String name, String pword) {
        username = name;
        password = pword;
        mostRecentlyWatched = null; // Beginning of reviews list
        numReviews = 0;
    }
    public String getUsername(){return username;}
    // Creates link within profile to new movie review created by user
    public void newReview(String title) {
        /*
         * Interactive method that prompts user for appropriate inputs
         * to instantiate a new review object and then proceeds to call appropriate set functions
         *
         * Carries out following tasks: Increments numReviews by 1
         *                              Calls review(title, this.username) to
         *                                  set title and critic variables of constructor
         *                              Prompts for genres and calls set method
         *                              Prompts for rating and calls set method
         *                              Prompts for yes/no recommend? and calls set method
         *
         *                              mostRecentlyWatched.info = new movie object of review
         *                              reviews.link references first review made by user
         */
    }
}

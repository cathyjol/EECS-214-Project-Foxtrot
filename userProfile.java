/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserProfile;

/**
 *
 * @author Boochi
 */
public class profile {
    public String username; // Name of user
    private String password;
    public node reviews; // First review created by user
    public node mostRecentlyWatched; // Last movie reviewed by user
    public int numReviews; // Number of reviews created by user
    
    public profile (String name, String pword) {
        username = name;
        password = pword;
        reviews = null;
        mostRecentlyWatched = null;
        numReviews = 0;
    }
    public String getUsername(){return username;}
    protected String getPassword(){return password;}
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


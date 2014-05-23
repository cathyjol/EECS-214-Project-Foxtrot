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
public class review {
    public String title; // Title of the movie
    private int rating; // User rating
    public String[] genreList; // List (maximum of 3) of movie's genres
    public profile critic;
    private int recommends;
    //protected Movie location; // Node containing movie reviewed, if already in database
    
    public review(profile critic, String title, int rating, String genre1, String genre2, String genre3, int recommendation) {
        this.title = title;
        this.critic = critic;
        genreList = new String[3];
        genreList[0] = genre1;
        genreList[1] = genre2;
        genreList[2] = genre3;
        recommends = recommendation;
    }

    // Gets review rating
    public int getRating() {
        return rating;
    }
    
    // Gets review genre
    public String getGenre(int index) {
        return genreList[index];
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

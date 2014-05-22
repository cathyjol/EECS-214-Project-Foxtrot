/*
 * Classes
 * EECS 214 Project Foxtrot
 * Movie database
 */
package finalproject;

public class movie {
    public String title; // Title of the movie
    public double rating; // Review-averaged rating
    public int numReviews; // Number of times movie has been reviewed by users
    public String[] genreList; // List (maximum of 3) of movie's genres
    
    // Constructor method
    public movie(String t, double r) {
        title = t;
        if(r > 5)
            rating = 5;
        else if(r < 0)
            rating = 0;
        else
            rating = r;
        numReviews = 1;
        genreList = new String[3];
    }
    
    
    // Returns string of movie (includes title, genre, rating and # reviews)
    @Override public String toString() {
        String genreString = null;
        for(int i = 0; i < 3; i++) {
            genreString = genreString + "     " + this.genreList[i] + "\n";
        }
        String output = this.title + "\n"
                        + genreString
                        + this.rating + " (Reviewed by " + this.numReviews + " users)\n";
        return output;
    }
    
    // Initialize genres
    public void setGenre(String genre1, String genre2, String genre3) {
        genreList[0] = genre1;
        genreList[1] = genre2;
        genreList[2] = genre3;
    }
        
    // Iterates through movie's array of genres
    // and adds reference to itself within appropriate genres
    public void addToGenre(genres genre) {
        /*
         * Accessing this.genreList[], iterates through pre-determined genre titles
         * and if (genre.title).equals(this.genreList[i]) (i.e. a genre within the movie's genre array
         * matches a genre within our pre-determined set, the genres.add(this) will be invoked
         */
        for(int i=0;i<3;i++)
        {
            if(this.genreList[i].equals(genre.title))
                genre.add(this);
        }
    }
    
    public void setRating(int rating) {
        /* 
         *
         */
         this.rating = (this.rating * numReviews + rating) / (numReviews + 1);
         numReviews += 1;
    }
    
    // Iterates through list of movies within a genre to compare this movie's rating,
    // such that its ranking can be determined relative to other movie's average ratings
    public int compareToRank(movie opponent) {
        /*
         * If this.rating > opponent.rating, position this movie before opponent in list
         * If this.rating < opponent.rating, position this movie after opponent in list
         * If this.rating == opponent.rating, position this movie before opponent in list
         */
        if(this.rating > opponent.rating)
            return 1;
        if(this.rating < opponent.rating)
            return -1;
        else
            return 0;
    }
    
    // 
    public int compareToTitle(movie opponent) {
        if(this.title.compareToIgnoreCase(opponent.title) < 0)
            return -1;
        else if(this.title.compareToIgnoreCase(opponent.title) > 0)
            return 1;
        else 
            return 0;
    }
}

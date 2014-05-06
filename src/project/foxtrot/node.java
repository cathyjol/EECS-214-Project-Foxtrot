/*
 * Classes
 * EECS 214 Project Foxtrot
 * Movie database
 */
package project.foxtrot;

// Node class to create movie database and genres lists
public class node {
    private node link;
    public movie info;
    
    public node(movie info) {
        this.info = info;
        link = null;
    }
    
    // Sets info of this node
    public void setInfo(movie info)
    {
        this.info = info;
    }
    
    // Returns info of this node
    public movie getInfo() {
        return info;
    }
    
    // Sets link of this node
    public void setLink(node link) {
        this.link = link;
    }

    // Returns link of this node
    public node getLink() {
        return link;
    }
}

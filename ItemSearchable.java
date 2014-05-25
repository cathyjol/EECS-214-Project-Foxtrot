/**

 * Implementation of the Searchable interface that searches a List of String objects. 

 * This implementation searches only the beginning of the words, and is not be optimized

 * for very large Lists. 

 * @author G. Cope

 *

 */
package UserProfile;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class ItemSearchable implements Searchable<String,String>{
    
	private List<String> terms = new ArrayList<String>();
	/**
	 * Constructs a new object based upon the parameter terms. 
	 * @param terms The inventory of terms to search.
	 */
	public ItemSearchable(List<String> terms){
		this.terms.addAll(terms);
	}
        
        @Override
	public Collection<String> search(String value) 
        {
		List<String> founds = new ArrayList<String>();
		for ( String s : terms ){
			if ( s.indexOf(value) == 0 ){
				founds.add(s);
			}
		}
		return founds;
	}
}

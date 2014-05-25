
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

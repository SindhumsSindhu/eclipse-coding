package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class Movie{
	int year;
	String mname;
	String mhero;
	public Movie(int year, String i, String mhero) {
		super();
		this.year = year;
		this.mname = i;
		this.mhero = mhero;
	}
	@Override
	public String toString() {
		return "Movie [year=" + year + ", mname=" + mname + ", mprice=" + mhero + "]";
	}
	
	
}

	
	
	
class SortBymname implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		
		return o1.mname.compareTo(o2.mname);
	}

}
class SortByyear implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
	
		return o1.year-o2.year;
	}
	
}
class SortBymhero implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
	
		return o1.mhero.compareTo(o2.mname);
	}
	
}

class SortbyMoviePrice implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class Movieex{
    	public static void main(String args[]) {
    		ArrayList<Movie> ar = new ArrayList<Movie>();
    		ar.add(new Movie(1997, "jack", "DDLJ"));
    		ar.add(new Movie(2002, "zero", "Baghban"));
    		ar.add(new Movie(2019, "darling", "Baby"));
    		ar.add(new Movie(2018, "john", "Kabir Singh"));
    		
    		Collections.sort(ar,new SortbyMoviePrice());
    		
    		System.out.println("Sort by movie name");
    		for(int i =0;i<ar.size();i++) {
    			System.out.println(ar.get(i));
    		}

    	}

    		
    	}
    

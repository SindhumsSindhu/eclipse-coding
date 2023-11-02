package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class Exx {

	public static void main(String[] args) {
	HashSet<String> name=new HashSet<String>();
	name.add("Pooja");
	name.add("Akash");
	name.add("Chetan");
	name.add(null);
	name.add("Pruthvi");
	name.add("Akash");
	name.add(null);
	System.out.println(name);
	System.out.println("Retrive data using iterator");
	Iterator<String> itr=name.iterator();
	while(itr.hasNext()) {
		String s=itr.next();
		System.out.println(s);
	}

	}

}

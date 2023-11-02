package collectionframework;

import java.util.HashSet;

public class Ex {

	public static void main(String[] args) {
	HashSet<String> name = new HashSet<String>();
	name.add("Akash");
	name.add("Chetan");
	name.add("Pruthvi");
	System.out.println(name);
	name.add("Akash");
	System.out.println(name);

	}

}

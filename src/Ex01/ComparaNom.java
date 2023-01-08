package Ex01;

import java.util.Comparator;

public class ComparaNom implements Comparator<Persona>{
	


	@Override
	public int compare(Persona o1, Persona o2) {

		String nom1=o1.getNom();
		String nom2=o2.getNom();
		return nom1.compareTo(nom2);
	}

}

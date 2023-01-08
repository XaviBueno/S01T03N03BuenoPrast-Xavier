package Ex01;

import java.util.Comparator;

public class ComparaDni implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {

		String dni1=o1.getDni();
		String dni2=o2.getDni();
		return dni1.compareTo(dni2);	
	}

}

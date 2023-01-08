package Ex01;

import java.util.Comparator;

public class ComparaCognom implements Comparator<Persona>{
	
	

	@Override
	public int compare(Persona o1, Persona o2) {
		String Cognom1=o1.getCognom();
		String Cognom2=o2.getCognom();
		return Cognom1.compareTo(Cognom2);	}
	

}

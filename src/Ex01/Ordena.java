package Ex01;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Ordena {
	
	public Ordena() {
		
	}
	
	public void mostraLListasAscDesc(String arxiu, Comparator<Persona> comparador,boolean ascDesc) {
		
		TreeSet<Persona > llistaPersonas= new TreeSet<>(comparador);
		GestioArxiu gestioArxiu=new GestioArxiu();
		Iterator<Persona> iterator;
		llistaPersonas=gestioArxiu.llegirArxiu(arxiu, comparador);
		String linea="";
		if(ascDesc) {
			iterator=llistaPersonas.iterator();
		}
		else {
			 iterator=llistaPersonas.descendingIterator();
		}
		
		System.out.println(String.format("%-20s %-20s %-12s","Nom", "Cognoms","DNI"));
		for(int i=0;i<52;++i) {
			linea=linea.concat("-");
			
		}
		//System.out.println("---------------------------------------------------");
		System.out.println(linea);
		while(iterator.hasNext()) {
				
			System.out.println(iterator.next().toString());
		}

	}
}

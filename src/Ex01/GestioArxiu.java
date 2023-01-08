package Ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class GestioArxiu {
	
	
	
	public void  afegirPersonaArxiu(String arxiu) {
		//String nom;
		//String cognoms;
		//String dni;
		String linea;
		boolean resp;
		
		
		linea=demanaPersona();
		
		
		
		try {
			File file=new File(arxiu);
			if(file.exists()) {
				afegirLineaArxiu(linea,arxiu);
			}
			else {
				resp=Entrada.llegirSiNo("L'arxiu "+ arxiu+ " no existeix, el vols crear S/N");
				if(resp) {
					file.createNewFile();
					afegirLineaArxiu(linea,arxiu);
				}
			}
				
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public TreeSet<Persona> llegirArxiu(String arxiu,Comparator<Persona> comparador) {
		
		String linea="";
		String[] contingut=null;
		
		//ComparaNom comparaNom=new ComparaNom();
		TreeSet<Persona>personas =new TreeSet<>(comparador);
		
		
		
		try {
			FileReader input =new FileReader(arxiu);
			BufferedReader inputBuffer= new BufferedReader(input);
			while(linea!=null) {
				linea=inputBuffer.readLine();
				if(linea!=null) {
					Persona persona= new Persona();
					contingut=linea.split(",");
					persona.setNom(contingut [0]);
					persona.setCognom(contingut [1]);
					persona.setDni(contingut [2]);
					personas.add(persona);
				
				}

				
			}
			
			inputBuffer.close();
			
		} catch (IOException e) {
			System.out.println("Arxiu no trobat");
		
		}
		return personas;
	}
	
	public void afegirLineaArxiu(String linea,String arxiu)  {
		
		try {
			FileWriter output =new FileWriter(arxiu,true);
			BufferedWriter outputBuffer= new BufferedWriter(output);
			outputBuffer.write(linea);
			outputBuffer.newLine();
			outputBuffer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	public String demanaPersona() {
		
        String output=null;
		String nom=Entrada.llegirString("Introdueix nom");
		String cognoms=Entrada.llegirString("Introdueix cognoms");
        String dni=Entrada.llegirString("Introdueix DNI");
        if(nom==""||cognoms==""||dni=="") {
        	System.out.println("Dades Incorrectes");
        }
        else {
			output=nom+","+cognoms+","+dni;
		}
       	return output;
	}
	

}

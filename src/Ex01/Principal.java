package Ex01;

import java.util.Comparator;


public class Principal {

	public static void main(String[] args) {
		int opcio=0;
		
		 do{
			opcio=menu();
			gestionaMenu(opcio);
			
		}while (opcio!=0);
		
	}
	static int menu() {
		
		
		 System.out.println( "1.- Introduir persona.");
		 System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");
		 System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");
		 System.out.println("4.- Mostrar les persones ordenades per cognoms (A-Z).");
		 System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");
		 System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
		 System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");
		 System.out.println("0.- Sortir.");
		 return Entrada.llegirInt("Selecciona una opció");
	 
	 
 }

 static void gestionaMenu(int opcio) {
	 String arxiu="persones.txt";
	 Ordena llistat= new Ordena();
	 Comparator<Persona> comparador=null;
	 GestioArxiu gestioArxiu=new GestioArxiu();
	 
		 switch (opcio) {
		 	case 0:
		 		
		 		break;
		 	case 1:
		 		gestioArxiu.afegirPersonaArxiu(arxiu);
		 		break;
		 	case 2:
		 		comparador=new ComparaNom();
		 		llistat.mostraLListasAscDesc(arxiu,comparador,true);
		 		break;
		 	case 3:
		 		comparador=new ComparaNom();
		 		llistat.mostraLListasAscDesc(arxiu,comparador,false);
		 		break;
		 	case 4:
		 		comparador=new ComparaCognom();
		 		llistat.mostraLListasAscDesc(arxiu,comparador,true);
		 		break;
		 	case 5:
		 		comparador=new ComparaCognom();
		 		llistat.mostraLListasAscDesc(arxiu,comparador,false);
		 	case 6:
		 		comparador=new ComparaDni();
		 		llistat.mostraLListasAscDesc(arxiu,comparador,true);
		 		break;
		 	case 7:
		 		comparador=new ComparaDni();
		 		llistat.mostraLListasAscDesc(arxiu,comparador,false);
		 		break;
		 	default:
		 		System.out.println("Opció incorrecte");
		 }
	 
	 }

}

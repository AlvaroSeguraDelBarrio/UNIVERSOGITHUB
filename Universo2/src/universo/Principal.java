package universo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		ArrayList<Planeta> listaPlanetas =  new ArrayList();
		
	//	Planeta p1 = new Planeta("TIERRA",1.0,2.0,3.0,4.0,5.0,6.0,7.0);
	//	Planeta p2 = new Planeta("JUPITER",1.0,2.0,3.0,4.0,5.0,6.0,7.0);
		//p1.muestra();
		
		listaPlanetas.add(new Planeta("TIERRA",1.0,2.0,3.0,4.0,5.0,6.0,7.0));
		listaPlanetas.add(new Planeta("JUPITER",1.0,2.0,3.0,4.0,5.0,6.0,7.0));
		
		
		
		Satelite s1 = new Satelite("LUNA", 1.0,2.0,3.0,4.0,5.0,6.0,7.0);
		
		System.out.println("INTRODUCE UN PLANETA PARA ASIGNAR EL SATELITE CREADO");
		String planeta = teclado.nextLine();
		
		asignarSateliteAPlaneta(listaPlanetas,planeta,s1);
		
		
		
		//s1.muestra();
	//	s1.setPlaneta(p1);
		//s1.muestra();
	//	p1.aÃ±adirSatelite(s1);
	 
	/*	p1.aÃ±adirSatelite(new Satelite("DA IGUAL", 1.0,2.0,3.0,4.0,5.0,6.0,7.0));	
		System.out.println("MUESTRO DIRECTAMENTE EL CONTENIDO DE LA VARIABLE P1");
		p1.muestra();
		*/
		System.out.println("MUESTRO LA INFO DE TODOS LOS PLANETAS (CON SUS SATÃ‰LITES)");
		for (Planeta p:listaPlanetas) {
			p.muestra();			
		}
		
		
		
	}
	
	public static void asignarSateliteAPlaneta(ArrayList<Planeta> listaPlanetas, String planeta,Satelite s1) {
		//quiero buscar el planeta que me llega por parÃ¡metro
		for (Planeta p:listaPlanetas) {
			 		
		}
		
		
		
		

	}

}

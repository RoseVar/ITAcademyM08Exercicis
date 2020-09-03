package org.vargas.M08;

import org.vargas.M08.model.Rocket;

public class M8_Fase2 {

	public static void main(String[] args) {
		//FASE 2:
		//Volem millorar el software perquè el propulsor tingui una potència màxima.
		//Modifiquem en el main anterior:
						
		//1. Creem dos coets amb els codis “32WESSDS” I “ ”. (EL SEGUNDO CODIGO ES DE LA FASE ANTERIOR) 
		Rocket coheteUno = new Rocket();
		coheteUno.setCodi("32WESSDS");
		
		Rocket coheteDos = new Rocket();
		coheteDos.setCodi("LDSFJA32");
		
		//El primer coet tindrà tres propulsors (potència: 10,30,80)
		coheteUno.setNumPropulsors(3);
		int[] prop= {10,30,80};
		coheteUno.setPotPropulsors(prop);
		
		//i el segon sis propulsors (potència: 30,40,50,50,30,10).
		coheteDos.setNumPropulsors(6);
		int[] prop2= {30,40,50,50,30,10};
		coheteDos.setPotPropulsors(prop2);
		
		//2. Mostrar a pantalla el codi dels coets, el número de propulsors que té i 
		//la potència màxima de cada propulsor. [SIGO EL MODELO DEL ENUNCIADO]
		System.out.print(coheteUno.getCodi() + ": ");
		for (int i=0; i<coheteUno.getPotPropulsors().length; i++){
			System.out.print(coheteUno.getPotPropulsors()[i]);
			if (i!=coheteUno.getPotPropulsors().length-1) {
				System.out.print(",");
			}
		}
		System.out.println();
		
		System.out.print(coheteDos.getCodi() + ": ");
		for (int i=0; i<coheteDos.getPotPropulsors().length; i++){
			System.out.print(coheteDos.getPotPropulsors()[i]);
			if (i!=coheteDos.getPotPropulsors().length-1) {
				System.out.print(",");
			}
		}
	}
}


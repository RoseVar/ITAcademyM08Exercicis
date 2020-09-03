package org.vargas.M08;

import org.vargas.M08.model.Rocket;

public class M8_Fase1 {

	public static void main(String[] args) {
		// FASE 1:
		//Volem fer un software de carreres de coets. Un coet est� identificat per un codi de 8 car�cters 
		//i un n�mero de propulsors.
		//Realitza els seg�ents passos:
		
		//1. Creem dos coets amb els codis �x� I �LDSFJA32�. 
		Rocket coheteUno = new Rocket();
		coheteUno.setCodi("x");
		
		Rocket coheteDos = new Rocket();
		coheteDos.setCodi("LDSFJA32");
		
		//El primer coet tindr� tres propulsors i el segon sis propulsors.	
		coheteUno.setNumPropulsors(3);
		coheteDos.setNumPropulsors(6);
		
		//2. Mostrar a pantalla el codi dels coets i el n�mero de propulsors que t�.
		System.out.println("Datos de cohete uno: ");
		System.out.println(coheteUno.toString());
		
		System.out.println("Datos de cohete dos: ");
		System.out.println(coheteDos.toString());
	}

}


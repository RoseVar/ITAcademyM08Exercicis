package org.vargas.M08.model;

import java.util.ArrayList;
import java.util.List;

public class ModelFase3 {
	//Attributes
	RocketFase3 coheteUno;
	RocketFase3 coheteDos;
	
	//Constructor
	public ModelFase3() {
		coheteUno = new RocketFase3();
		coheteUno.setCodi("32WESSDS");
		List<PropulsorFase3> prop= new ArrayList<PropulsorFase3>();
		prop.add (new PropulsorFase3(10, coheteUno.getCodi(), 1));
		prop.add (new PropulsorFase3(30, coheteUno.getCodi(), 2));
		prop.add (new PropulsorFase3(80, coheteUno.getCodi(), 3));
		coheteUno.setPropulsors(prop);

		
		coheteDos = new RocketFase3();
		coheteDos.setCodi("LDSFJA32");
		List<PropulsorFase3> prop2= new ArrayList<PropulsorFase3>();
		prop2.add (new PropulsorFase3(30, coheteDos.getCodi(), 1));
		prop2.add (new PropulsorFase3(40, coheteDos.getCodi(), 2));
		prop2.add (new PropulsorFase3(50, coheteDos.getCodi(), 3));
		prop2.add (new PropulsorFase3(50, coheteDos.getCodi(), 4));
		prop2.add (new PropulsorFase3(30, coheteDos.getCodi(), 5));
		prop2.add (new PropulsorFase3(10, coheteDos.getCodi(), 6));
		coheteDos.setPropulsors(prop2);
	}

	//Getters
	public RocketFase3 getCoheteUno() {
		return coheteUno;
	}

	public RocketFase3 getCoheteDos() {
		return coheteDos;
	}
	
	

}

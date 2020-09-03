package org.vargas.M08.model;

import java.util.Arrays;

public class Rocket {

	//Attributes
	String codi=null;
	int numPropulsors=0;
	int[] potPropulsors= null;
	
	public Rocket(){}
	
	
	public Rocket(String codi, int numPropulsors) {
		this.codi= codi;
		this.numPropulsors= numPropulsors;
		potPropulsors= new int[numPropulsors];		
	}


	public String getCodi() {
		return codi;
	}


	public void setCodi(String codi) {
		this.codi = codi;
	}


	public int getNumPropulsors() {
		return numPropulsors;
	}


	public void setNumPropulsors(int numPropulsors) {
		this.numPropulsors = numPropulsors;
	}


	public int[] getPotPropulsors() {
		return potPropulsors;
	}


	public void setPotPropulsors(int[] potPropulsors) {
		this.potPropulsors = potPropulsors;
	}
	
	public void setPotPropulsorAtIndex (int potencia, int index) {
		this.potPropulsors[index]= potencia;
	}


	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Cohete:[");
		if (codi!=null) {
			sb.append("codi: "); sb.append(codi);sb.append(",");
		}
		if (numPropulsors!=0) {
			sb.append(" numero de propulsores: "); sb.append(numPropulsors);sb.append(",");
		}
		if (potPropulsors!=null) {
			sb.append(" potencia de propulsores: {");
			for (int pot: potPropulsors) {
				sb.append(pot); sb.append (", "); 
			}
			sb.deleteCharAt(sb.lastIndexOf(", "));
			sb.deleteCharAt(sb.lastIndexOf(" "));
			sb.append("}");
		} else {
			sb.deleteCharAt(sb.lastIndexOf(","));
		}
		sb.append("]");
	
		return sb.toString();
	}
	
	
}

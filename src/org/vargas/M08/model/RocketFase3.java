package org.vargas.M08.model;

import java.util.ArrayList;
import java.util.List;

public class RocketFase3{

	//Attributes
	String codi=null;
	List<PropulsorFase3> propulsors;
	
	//Constructores
	public RocketFase3(){}
	
	
	public RocketFase3(String codi) {
		this.codi= codi;
		propulsors= new ArrayList<PropulsorFase3>();
	}

	//getters y setters
	public String getCodi() {
		return codi;
	}


	public void setCodi(String codi) {
		this.codi = codi;
	}


	public List<PropulsorFase3> getPropulsors() {
		return propulsors;
	}


	public void setPropulsors(List<PropulsorFase3> propulsors) {
		this.propulsors = propulsors;
	}


	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Cohete:[");
		if (codi!=null) {
			sb.append("codi: "); sb.append(codi);sb.append(",");
		}
		if (!propulsors.isEmpty()) {
			sb.append(" potencia de propulsores: {");
			for (PropulsorFase3 pro: propulsors) {
				sb.append(pro.getPotActual()); sb.append (", "); 
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

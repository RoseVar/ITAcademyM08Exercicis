package org.vargas.M08.model;

public class PropulsorFase3 extends Thread {
	//Atributos
	int potMax;
	int potActual;
	boolean estaMaximo;
	boolean estaParado;
	boolean acelerando;
	boolean frenando;
	String cohete;
	int numProp;

	//Constructor
	public PropulsorFase3(int potMax, String cohete, int numProp) {
		this.potMax = potMax;
		potActual = 0;
		estaMaximo = false;
		estaParado = true;
		acelerando = false;
		frenando = true;
		this.cohete = cohete;
		this.numProp = numProp;
	}

	//Getters y setters
	public int getPotMax() {
		return potMax;
	}

	public void setPotMax(int potMax) {
		this.potMax = potMax;
	}

	public int getPotActual() {
		return potActual;
	}

	public void setPotActual(int potActual) {
		this.potActual = potActual;
	}

	public boolean isEstaMaximo() {
		return estaMaximo;
	}

	public void setEstaMaximo(boolean estaMaximo) {
		this.estaMaximo = estaMaximo;
	}

	public boolean isEstaParado() {
		return estaParado;
	}

	public void setEstaParado(boolean estaParado) {
		this.estaParado = estaParado;
	}

	public boolean isAcelerando() {
		return acelerando;
	}

	public void setAcelerando(boolean acelerando) {
		this.acelerando = acelerando;
	}

	public boolean isFrenando() {
		return frenando;
	}

	public void setFrenando(boolean frenando) {
		this.frenando = frenando;
	}

	public String getCohete() {
		return cohete;
	}

	public void setCohete(String cohete) {
		this.cohete = cohete;
	}

	public int getNumProp() {
		return numProp;
	}

	public void setNumProp(int numProp) {
		this.numProp = numProp;
	}

	@Override
	public void run() {		
		while (true) {				
			try {
				sleep(1000);
				if (acelerando) {
					//siempre que no esté al máximo
					if (!this.isEstaMaximo()) {
						//súbele 5 y sácalo por pantalla
						this.setPotActual(potActual+5);
						System.out.println("Cohete "+this.getCohete() + ", propulsor "+ this.getNumProp()+": sube a " 
								+ this.getPotActual() + " de potencia");
						//nos aseguramos de avisar que no está ya parado (potencia 0)
						this.setEstaParado(false);
						//si ha llegado a su potencia máxima, cambia el booleano de control de potencia máxima a true
						if (this.getPotActual()== this.getPotMax()) {
							this.setEstaMaximo(true);

						}
					} else {
						System.out.println("Cohete "+this.getCohete() + ", propulsor "+ this.getNumProp()+		    
								": ya estaba a su máxima potencia ("+ this.getPotMax()+"), así que no puede acelerar más.");
						//cambiamos la condición para el if
						acelerando= false; 
					}		       		

				}

				if (frenando) {
					//siempre que no esté parado
					if (!this.isEstaParado()) {
						//restale 5 y sácalo por pantalla
						this.setPotActual(potActual-5);
						System.out.println("Cohete "+this.getCohete() + ", propulsor "+ this.getNumProp()+": baja a " 
								+ this.getPotActual() + " de potencia");
						//nos aseguramos de avisar que no tiene está a su potencia máxima
						this.setEstaMaximo(false); 		       					       			
						//si ha llegado a 0, cambia el booleano de control de parado a true
						if (this.getPotActual()== 0) {
							this.setEstaParado(true);
						}
					} else {
						System.out.println("Cohete "+this.getCohete() + ", propulsor "+ this.getNumProp()+								  
								": ya estaba a 0 de potencia, así que está parado y no puede frenar más");
						//cambiamos la condición para el if
						frenando= false; 
					}			       		
				}	
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
		}
	}
}
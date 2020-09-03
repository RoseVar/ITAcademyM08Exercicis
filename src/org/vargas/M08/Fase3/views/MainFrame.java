package org.vargas.M08.Fase3.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.vargas.M08.model.ModelFase3;
import org.vargas.M08.model.PropulsorFase3;
import org.vargas.M08.model.RocketFase3;

public class MainFrame extends JFrame implements ActionListener{
    //Atrtibutos
    ModelFase3 myModel;
    ActionListener myListener;
    
    //Componentes
    MainPanel myPanel;

    //Constructor
    public MainFrame(ModelFase3 myModel) {
        this.myModel= myModel;
        myListener= this;
        this.myPanel= new MainPanel(myListener);        
        initComponents();
        myPanel.setTextCodiCohete1("Cohete: "+ myModel.getCoheteUno().getCodi());
        myPanel.setTextCodiCohete2("Cohete: "+ myModel.getCoheteDos().getCodi());
    }

    //Crear elementos
    private void initComponents() {
        this.setTitle("Juego de los cohetes");        
        getContentPane().add(myPanel);
        this.setSize(550, 400);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //recuperamos la accion que se ha hecho
        String action = e.getActionCommand();
        //y en función de la acción...
        switch (action) {
            case "acelerarUno":
                acelerar(myModel.getCoheteUno());
                break;
            case "frenarUno":
                frenar(myModel.getCoheteUno());            	
                break;
            case "acelerarDos":
                acelerar(myModel.getCoheteDos());
                break;
            case "frenarDos":
                frenar(myModel.getCoheteDos());
                break;       
            default: 
                break;
        }
     
        
    }
    
    
    /**
     * Metodo para acelerar los propulsores de un cohete
     */
    private void acelerar(RocketFase3 queCohete) {
    	System.out.println("ACELERANDO COHETE " + queCohete.getCodi());
    	//si es el cohete 1
    	if (queCohete.equals(myModel.getCoheteUno())) {
    		//por cada propulsor
    		for (PropulsorFase3 prop: myModel.getCoheteUno().getPropulsors()) {
    			//indico que está acelerando y que no está frenando
    			prop.setAcelerando(true); 
    			prop.setFrenando(false);
    			//y si no está activo el hilo, actívalo
    			if (!prop.isAlive()) {
    				prop.start();
    			} 
    		}

    	}
    	//Si es cohete 2, lo mismo que arriba
    	if (queCohete.equals(myModel.getCoheteDos())) {		    		
    		for (PropulsorFase3 prop: myModel.getCoheteDos().getPropulsors()) { 
    			prop.setAcelerando(true);
    			prop.setFrenando(false);
    			if (!prop.isAlive()) {
    				prop.start();
    			}
    		}
    	}
        
    }

    /**
     * Método para frenar los propulsores de un cohete
     */
    private void frenar(RocketFase3 queCohete) {
    	System.out.println("FRENANDO COHETE " + queCohete.getCodi());
    	//Si es el cohete 1
    	if (queCohete.equals(myModel.getCoheteUno())) {
    		//por cada propulsor
    		for (PropulsorFase3 prop: myModel.getCoheteUno().getPropulsors()) {
    			//indico que está frenando y que no está acelerando 
    			prop.setFrenando(true);
    			prop.setAcelerando(false); 
    			//si el hilo no está activo, lo activo
    			if (!prop.isAlive()) {
    				prop.start();
    			}
    		}
    	}
    	//si es el cohete 2, lo mismo que arriba
    	if (queCohete.equals(myModel.getCoheteDos())) {
    		for (PropulsorFase3 prop: myModel.getCoheteDos().getPropulsors()) {
    			prop.setFrenando(true);
    			prop.setAcelerando(false);	
    			if (!prop.isAlive()) {
    				prop.start();
    			}
    		}
    	}
    }    
}
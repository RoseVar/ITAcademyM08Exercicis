package org.vargas.M08.Fase3.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainPanel  extends JPanel {
    //Atributes
    private JLabel cohete1;       
    private JLabel cohete2;    
       
    private JButton acelerarUno;
    private JButton frenarUno;
    private JButton acelerarDos;
    private JButton frenarDos;
    
    private Image imgCohete1;
    private Image imgCohete2;
    
    ActionListener myListener;   
    
    //Constructor
    public MainPanel (ActionListener listener) {   
        this.myListener= listener;
        initComponents();
    }
    
    

    /**
     * Method for create the view and components and data of it
     */
    private void initComponents() {
        BorderLayout mainLayout= new BorderLayout();
        
        //Pongo un Layout de background
        this.setLayout(mainLayout);
        
        //Panel para etiquetas de los cohetes
        JPanel etiquetasCohetes = new JPanel();
        GridLayout flow1= new GridLayout(1,2);
        etiquetasCohetes.setLayout(flow1);
        
        cohete1= new JLabel("COHETE 1");
        cohete1.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetasCohetes.add(cohete1);
        
        cohete2= new JLabel("COHETE 2");
        cohete2.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetasCohetes.add(cohete2);
        
        this.add(etiquetasCohetes, BorderLayout.NORTH );
        
        //Panel de las imagenes de los cohetes
        JPanel imagenesCohetes = new JPanel();
        GridLayout flow2= new GridLayout(1,2);
        imagenesCohetes.setLayout(flow2);
               
        JLabel imgCohete= new JLabel();  
        imgCohete.setHorizontalAlignment(SwingConstants.CENTER);
        try{
        	imgCohete.setIcon(new ImageIcon("src/rocket1Up.png"));        
        } catch (Exception e) {
			imgCohete.setText("Imagen cohete 1 no cargada");
		} 
        imagenesCohetes.add(imgCohete);
        
        JLabel imgCohete2= new JLabel();  
        imgCohete2.setHorizontalAlignment(SwingConstants.CENTER);
        try{
        	imgCohete2.setIcon(new ImageIcon("src/rocket2Up.png"));        
    	} catch (Exception e) {
    		imgCohete2.setText("Imagen cohete 2 no cargada");
    	} 
        imagenesCohetes.add(imgCohete2);
        
        this.add(imagenesCohetes, BorderLayout.CENTER);
        
        
        //Panel para botones de los cohetes
        JPanel botonesCohetes = new JPanel();
        FlowLayout flow3= new FlowLayout();
        flow3.setHgap(50);
        botonesCohetes.setLayout(flow3);
        
		acelerarUno = new JButton ("Acelerar");
		acelerarUno.setActionCommand("acelerarUno");
		acelerarUno.addActionListener(myListener);
		botonesCohetes.add(acelerarUno);
		
		frenarUno = new JButton ("Frenar");
		frenarUno.setActionCommand("frenarUno");
		frenarUno.addActionListener(myListener);
		botonesCohetes.add(frenarUno);
		
		acelerarDos = new JButton ("Acelerar");
		acelerarDos.setActionCommand("acelerarDos");
		acelerarDos.addActionListener(myListener);
		botonesCohetes.add(acelerarDos);
		
		frenarDos = new JButton ("Frenar");
		frenarDos.setActionCommand("frenarDos");
		frenarDos.addActionListener(myListener);
		botonesCohetes.add(frenarDos);
		
        this.add(botonesCohetes, BorderLayout.SOUTH );
              
    }
    
    //Método para poner el codigo del cohete 1 en su etiqueta
    public void setTextCodiCohete1(String codi) {
    	cohete1.setText(codi);
    }
    
  //Método para poner el codigo del cohete 1 en su etiqueta
    public void setTextCodiCohete2(String codi) {
    	cohete2.setText(codi);
    }
    
}

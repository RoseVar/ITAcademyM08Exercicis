package org.vargas.M08.Fase3;

import org.vargas.M08.Fase3.views.MainFrame;
import org.vargas.M08.model.ModelFase3;

public class M8_Fase3_app {

	public static void main(String[] args) {	  			
      ModelFase3 myModel= new ModelFase3();
      MainFrame myFrame= new MainFrame(myModel);
      myFrame.setVisible(true);      
  }  
		
	
}

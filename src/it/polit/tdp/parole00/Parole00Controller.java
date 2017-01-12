package it.polit.tdp.parole00;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.model.Model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Parole00Controller {
	
	private Model model= new Model();
	
	public void setModel(Model model){
		this.model= model;
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtText;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtArea;

    @FXML
    private Button btnCancella;

    @FXML
    void doCancella(ActionEvent event) {
    	txtArea.clear();
    	txtText.clear();
    }

    @FXML
    void doInserisci(ActionEvent event) {      
         txtArea.clear();
    	String s = txtText.getText();
    	if(s.length()==0){                                        
    		txtArea.appendText("Inserisci la parola! \n");
    		txtText.clear();
    		return;
    	}
    	for(int i =0; i<s.length(); i++){	
           if(!Character.isLetter(s.charAt(i))){                
	    	   txtArea.appendText("Il testo non è corretto! \n ");
	    	   return;
	    	  }
    	 }
    
         List<String> lista = model.getAggiungi(s);    
         List<String> ordinata =  model.getListaOrdinata(lista);
         txtArea.appendText(ordinata.toString());
    	
    }

    @FXML
    void initialize() {
        assert txtText != null : "fx:id=\"txtText\" was not injected: check your FXML file 'Parole00Sample.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole00Sample.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Parole00Sample.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Parole00Sample.fxml'.";

     }
}

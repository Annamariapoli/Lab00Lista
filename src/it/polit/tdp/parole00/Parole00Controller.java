package it.polit.tdp.parole00;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.model.Model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Parole00Controller {
	
	private Model model;
	Model elenco;
	
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
    void doInserisci(ActionEvent event) {               //suppongo possa inserire una parola per volta
    	//txtArea.clear();
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
    	
          elenco.addParola(s);                                       //non è una stringa ma una parola
    	  txtArea.appendText("la parola inserita è : "+ s+ "\n");
     //   List<String> paroleInserite = parola.getElenco();
    //	txtArea.appendText("le parole inserite precedentemente sono: "+paroleInserite+ " e la nuova parola è : "+s+ "\n");
    	
    }

    @FXML
    void initialize() {
        assert txtText != null : "fx:id=\"txtText\" was not injected: check your FXML file 'Parole00Sample.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole00Sample.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Parole00Sample.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Parole00Sample.fxml'.";

        elenco = new Model();
        
    }
}

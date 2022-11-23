package br.com.fatec.va4_1805_javafx_combo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SecondaryController {

    private Stage tela = new Stage();
    
    @FXML
    private Button btnChamada;

    @FXML
    private void btnChamada_Click(ActionEvent event) throws IOException {
 
       
        CAdastro cad = new CAdastro();
        cad.start(new Stage());
        
    }
}
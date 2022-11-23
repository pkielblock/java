/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.com.fatec.va4_1805_javafx_combo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Viotti
 */
public class CadastroController implements Initializable {

    @FXML
    private Button btnSair;
    
    private String dadoPassado;

    public String getDadoPassado() {
        return dadoPassado;
    }

    public void setDadoPassado(String dadoPassado) {
        this.dadoPassado = dadoPassado;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    

    public void mudaBotao() {
        btnSair.setText(dadoPassado);
    }
    
    @FXML
    private void btnSair_click(MouseEvent event) {
        System.out.println(getDadoPassado());
        CAdastro.tela.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.com.fatec.Controller;

import br.com.fatec.DAO.ProprietarioDAO;
import br.com.fatec.model.Proprietario;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Professor04
 */
public class ListaProprietarioController 
        implements Initializable {

    @FXML
    private TableView<Proprietario> tblProprietario;
    @FXML
    private TableColumn<Proprietario, Boolean> colSelecionado;
    @FXML
    private TableColumn<Proprietario, Integer> colCodigo;
    @FXML
    private TableColumn<Proprietario, String> colNome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colSelecionado.setCellValueFactory(
                new PropertyValueFactory<>("selecionado"));
        colNome.setCellValueFactory(
                new PropertyValueFactory<>("nome"));
        colCodigo.setCellValueFactory(
                new PropertyValueFactory<>("codProprietario"));
        
        //coloca o checkbox na coluna
        colSelecionado.setCellFactory(
                CheckBoxTableCell.forTableColumn(colSelecionado));

        //preenche a tabela
        tblProprietario.setItems(preencheTabela());
    }    

    private ObservableList<Proprietario> preencheTabela() {
        ProprietarioDAO dao = new ProprietarioDAO();
        ObservableList<Proprietario> proprietarios
            = FXCollections.observableArrayList();
        
        try {
            //busca somente que termina com 'a'
            //proprietarios.addAll(dao.lista("nome like '%a'"));
            //busca todo mundo
            proprietarios.addAll(dao.lista(""));
        } catch (SQLException ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR,
                    "Erro Preenche Tabela: " + ex.getMessage(),
                    ButtonType.OK);
            alerta.showAndWait();
        }
        
        return proprietarios;
    }
    
}

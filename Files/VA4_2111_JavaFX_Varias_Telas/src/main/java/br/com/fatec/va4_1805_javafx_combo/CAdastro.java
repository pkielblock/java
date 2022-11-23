/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package br.com.fatec.va4_1805_javafx_combo;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Viotti
 */
public class CAdastro extends Application {
    
    public static Stage tela;
    
    @Override
    public void start(Stage tela) throws IOException {
        setStage(tela);
        
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("cadastro.fxml"));
        Parent root = fxmlLoader.load();
        CadastroController controler = fxmlLoader.getController();
        controler.setDadoPassado("Funcionou");
        controler.mudaBotao();
        
        Scene scene = new Scene(root, 640, 480);
        
        tela.setScene(scene);
        tela.show();        

    }
    
    public static void setStage(Stage t) {
        tela = t;
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author taaan
 */
public class Monopoly extends Application {
    public static Stage newStage;
    public static Parent root;
    @Override
    public void start(Stage stage) throws Exception {
        
        this.newStage=stage;
        this.newStage.setTitle("Monopoly");
        showMainView();
        
    }
    private void showMainView() throws IOException{
        root = FXMLLoader.load(Monopoly.class.getResource("Intro.fxml"));
        
        Scene scene = new Scene(root);
        
       
        
        newStage.setScene(scene);
        newStage.show();
        
    }
    
    public static void showAnother() throws IOException{
        
       
        
        
        root = FXMLLoader.load(Monopoly.class.getResource("PlayScene.fxml"));
        
        Scene scene = new Scene(root);
        
       
        
        newStage.setScene(scene);
        newStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

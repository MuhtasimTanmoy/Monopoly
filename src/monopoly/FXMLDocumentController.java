/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import static monopoly.PlaySceneController.n;
import static monopoly.PlaySceneController.n2;
import static monopoly.PlaySceneController.singleName;
import static monopoly.PlaySceneController.twoPlayer1;
import static monopoly.PlaySceneController.twoPlayer2;


/**
 *
 * @author taaan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField SingleName;
    @FXML
    private TextField TwoPlayer2;
    @FXML
    private TextField TwoPlayer1;

    
    public static boolean load=false;
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    @FXML
    private void onButtonClick(ActionEvent event) throws IOException {
        
         //System.out.println("You clicked me!");
        
        //s=text.getText();
        
        //label.setText(s);
        singleName=SingleName.getText();
       
         twoPlayer1=TwoPlayer1.getText();
         
         
         twoPlayer2=TwoPlayer2.getText();
        
        
        
        
        Monopoly.showAnother();
    }

//    @FXML
//    private void onLoadClick(ActionEvent event) throws IOException {
//        
//        
//        
//        //singleName=SingleName.getText();
//       
//         //twoPlayer1=TwoPlayer1.getText();
//         
//         
//         //twoPlayer2=TwoPlayer2.getText();
//        
//        //load=true;
//        
//        
//        Monopoly.showAnother();
//        
//        
//        
//        
//         
//
//          
//    }

    @FXML
    private void onServerClick(ActionEvent event) throws IOException {
        Socket mySock;
        
        mySock=new Socket("HELLO",6789);
    }

    @FXML
    private void onClientClick(ActionEvent event) {
    }
    
}

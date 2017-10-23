/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_kesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Zhabiyan
 */
public class FXMLDocumentController implements Initializable {
    
   
         @FXML
    private Label label;

    @FXML
    private JFXTextField nama;

    @FXML
    private JFXTextField tinggi;

    @FXML
    private JFXTextField beratbadan;

    @FXML
    private JFXRadioButton laki;

    @FXML
    private ToggleGroup klmn;

    @FXML
    private JFXRadioButton perempuan;

    @FXML
    private Button prosses;

    @FXML
    private Button reset;

    @FXML
    private JFXTextField tf1;

    @FXML
    private JFXTextArea tf2;

    @FXML
    private JFXTextArea tf3;
    
     @FXML
    void proses(ActionEvent event) {
           String Nama = nama.getText();
           int Tinggi = Integer.parseInt(tinggi.getText());
           int Berat = Integer.parseInt(beratbadan.getText());
           int Ideal = 0;
           String status = null;
           String saran = null;
           if(laki.isSelected()){
               Ideal = Tinggi - 105;
            if(Ideal < Berat){
                status = "OverWeight";
                saran = "Tolong Kurangi Porsi Makan Anda";               
            }
            if(Ideal == Berat){
                status = "Ideal";
                saran = "Pertahankan";               
            }
            if(Ideal > Berat){
                status = "UnderWeight";
                saran = "Tolong Tambah Porsi Makan Anda";                
            }
           }
           if(perempuan.isSelected()){
               Ideal = Tinggi - 110;
            if(Ideal < Berat){
                status = "OverWeight";
                saran = "Tolong Kurangi Porsi Makan Anda";             
            }
            if(Ideal == Berat){
                status = "Ideal";
                saran = "Pertahankan";               
            }
            if(Ideal > Berat){
                status = "UnderWeight";
                saran = "Tolong Tambah Porsi Makan Anda";
            }
           }
           tf1.setText(""+Ideal);
           tf2.setText("Nama "+Nama+" , Anda "+status);
           tf3.setText(""+saran);           
    }
    

    @FXML
    void reset(ActionEvent event) {
        laki.setSelected(false);
        perempuan.setSelected(false);
        nama.setText("");
        tinggi.setText("");
        beratbadan.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
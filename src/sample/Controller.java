package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Controller {
   /* @FXML private TextField name;
    @FXML private TextField AddCategory;
    @FXML private TextField AddQ;
    @FXML private TextField AddPc;
    @FXML private TextField AddWeight;*/
    int i = 3;


    public void add(){
        //AddName.getText();
        Connection connection = null;
       // fx:id =
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:DB.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            //statement.executeUpdate("insert into weapons values(i,AddName.getText(),Integer.parseInt(AddCategory.getText()),Integer.parseInt(AddQ.getText()),AddPc.getText()),AddWeight.getText()");
            i++;
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }


    }
    public void next(){
    }
    public void prev(){

    }
    public void modify(){

    }
    public void cancel(){

    }
}

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controllerforside
{
  public void skifttilkunde(ActionEvent event) throws IOException
  {
    Parent kunde = FXMLLoader.load(getClass().getResource("Kunde.fxml"));
    Scene kundeScene = new Scene(kunde);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(kundeScene);
    window.show();
  }
  public void skifttilopgave(ActionEvent event) throws IOException
  {
    Parent opgave = FXMLLoader.load(getClass().getResource("Opgave.fxml"));
    Scene opgaveScene = new Scene(opgave);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(opgaveScene);
    window.show();
  }
  public void skifttilteammedlem(ActionEvent event) throws IOException
  {
    Parent teammedlem = FXMLLoader.load(getClass().getResource("Teammedlem.fxml"));
    Scene teamScene = new Scene(teammedlem);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(teamScene);
    window.show();
  }
  public void skifttilstart(ActionEvent event) throws IOException
  {
    Parent rolle = FXMLLoader.load(getClass().getResource("Rolle.fxml"));
    Scene rolleScene = new Scene(rolle);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(rolleScene);
    window.show();
  }
}


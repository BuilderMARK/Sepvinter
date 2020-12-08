package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

  /**
   * når denne knap trykkes skifter vi scene
   */

  public void skifttilforside(ActionEvent event) throws IOException
  {
    Parent forside = FXMLLoader.load(getClass().getResource("Forside.fxml"));
    Scene forsideScene = new Scene(forside);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
window.setScene(forsideScene);
window.show();
  }
}

package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField finishField;

    @FXML
    private ImageView mapView;

    @FXML
    private TextField startField;


    @FXML
    void showMap(ActionEvent event) {
        String start = startField.getText().trim().replace(" ", "%20");

        String finish = finishField.getText().trim().replace(" ", "%20");

        String url = "http://maps.googleapis.com/maps/api/staticmap?path="+start+"|"+finish+"&size=600x400&maptype=roadmap&sensor=false";

        Image map = new Image(url);

        mapView.setImage(map);


    }

    @FXML
    void initialize() {
        assert finishField != null : "fx:id=\"finishField\" was not injected: check your FXML file 'sample.fxml'.";
        assert mapView != null : "fx:id=\"mapView\" was not injected: check your FXML file 'sample.fxml'.";
        assert startField != null : "fx:id=\"startField\" was not injected: check your FXML file 'sample.fxml'.";


    }

}

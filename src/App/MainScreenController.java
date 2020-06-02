package App;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainScreenController {
    @FXML
    private StackPane mainStackPane;

    @FXML
    public void initialize(){
        loadLoginScreen();
    }

    @FXML
    public void loadLoginScreen() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("../FXML/loginScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        LoginScreenController loginScreenController = loader.getController();
        loginScreenController.setMainScreenController(this);
        setScreen(pane);
    }

    public void setScreen(Pane pane) {
        mainStackPane.getChildren().clear();
        mainStackPane.getChildren().add(pane);
    }
}

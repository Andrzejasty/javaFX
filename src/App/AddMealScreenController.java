package App;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class AddMealScreenController {
    MainScreenController mainScreenController;

    public void setMainScreenController(MainScreenController mainScreenController) {
        this.mainScreenController = mainScreenController;
    }

    @FXML
    private ChoiceBox<?> productChoiceBox;

    @FXML
    private TextField productWeight;

    @FXML
    private Label carbohydrates;

    @FXML
    private Label proteins;

    @FXML
    private Label fats;

    @FXML
    private Button addProductButton;

    @FXML
    private Button goBackButton;

    @FXML
    private Label errorsLabel;

    @FXML
    void addProductOnAction() {

    }

    @FXML
    void goBackOnAction() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("../FXML/menuScreen.fxml"));
        Pane pane = getPane(loader);
        MenuScreenController menuScreenController = loader.getController();
        menuScreenController.setMainScreenController(mainScreenController);
        mainScreenController.setScreen(pane);
    }
    public Pane getPane(FXMLLoader loader) {
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pane;
    }
}

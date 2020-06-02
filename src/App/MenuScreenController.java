package App;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuScreenController {
    MainScreenController mainScreenController;

    public void setMainScreenController(MainScreenController mainScreenController) {
        this.mainScreenController = mainScreenController;
    }

    @FXML
    private Button addMealButton;

    @FXML
    private Button statisticsButton;

    @FXML
    private Button addProductButton;

    @FXML
    private Button exitButton;

    @FXML
    void addMealOnAction() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("../FXML/addMealScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        AddMealScreenController addMealScreenController = loader.getController();
        addMealScreenController.setMainScreenController(mainScreenController);
        mainScreenController.setScreen(pane);
    }

    @FXML
    void addProductOnAction() {

    }

    @FXML
    void exitOnAction() {

    }

    @FXML
    void statisticsOnAction() {

    }

}

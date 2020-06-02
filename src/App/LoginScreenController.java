package App;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class LoginScreenController {
    private MenuScreenController menuScreenController;

    public void setMenuScreenController(MenuScreenController menuScreenController) {
        this.menuScreenController = menuScreenController;
    }

    private MainScreenController mainScreenController;

    public void setMainScreenController(MainScreenController mainScreenController) {
        this.mainScreenController = mainScreenController;
    }

    @FXML
    private TextField loginTextArea;

    @FXML
    private TextField passwordTextArea;

    @FXML
    private Button loginButton;

    @FXML
    private Button createNewAccountButton;

    public void setErrorsLable(Label errorsLable) {
        this.errorsLable = errorsLable;
    }

    @FXML
    private Label errorsLable;

    public void createNewAccountOnAction() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("createNewAccount.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        CreateNewAccountController createNewAccountController = loader.getController();
        createNewAccountController.setMainScreenController(mainScreenController);
        mainScreenController.setScreen(pane);
    }

    public void loginButtonOnAction(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("menuScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        MenuScreenController menuScreenController = loader.getController();
        menuScreenController.setMainScreenController(mainScreenController);
        mainScreenController.setScreen(pane);
    }
}

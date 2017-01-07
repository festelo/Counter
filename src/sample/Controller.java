package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ToggleButton counterButton;

    @FXML
    private HBox secondPanel;

    @FXML
    private HBox firstPanel;

    @FXML
    private HBox thirdPanel;

    @FXML
    private Button addTeapot;

    @FXML
    private Button removeTeapot;

    @FXML
    private Button addBulb;

    @FXML
    private Button removeBulb;

    @FXML
    private Button addComputer;

    @FXML
    private Button removeComputer;


    public void addTeapot() {
        System.out.println("addTeapot");
    }

    public void removeTeapot() {

    }

    public void addBulb() {

    }

    public void removeBulb() {

    }

    public void addComputer() {

    }

    public void removeComputer() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            block.BlockControl block1 = new block.BlockControl();
            block.BlockControl block2 = new block.BlockControl();
            block.BlockControl block3 = new block.BlockControl();

            firstPanel.getChildren().add(block1);
            secondPanel.getChildren().add(block2);
            thirdPanel.getChildren().add(block3);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

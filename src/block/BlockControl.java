package block;

import javafx.beans.DefaultProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;

@DefaultProperty(value = "control")
public class BlockControl extends VBox{

    boolean status = false;
    int temperature = 0;
    @FXML
    private Text tempBox;
    @FXML
    private TextField powerBox;
    @FXML
    private Text statusBox;
    @FXML
    private Button switchBtn;
    public BlockControl() throws IOException {
        FXMLLoader loader = new FXMLLoader( getClass().getResource( "block.fxml" ) );

        loader.setRoot( this );
        loader.setController( this );

        try {
            loader.load();
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        }
    }

    public int getPower()
    {
        return Integer.parseInt(powerBox.getText());
    }

    public void setOnAction(javafx.event.EventHandler<ActionEvent> event)
    {
        switchBtn.setOnAction(event);
    }

    public int getTemperature() {
        return temperature;
    }

    public void  setTemperature(int temp)
    {
        tempBox.setText("Температура: " + Integer.toString(temp));
        temperature = temp;
    }

    public void  setTemperatureVisible(boolean visible)
    {
        tempBox.setVisible(visible);
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean inpstatus)
    {
        if(status) {
            statusBox.setText("Статус: Включено");
        }
        else {
            statusBox.setText("Статус: Выключено");
        }
        status = inpstatus;
    }
}

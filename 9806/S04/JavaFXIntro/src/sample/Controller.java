package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField txt_name, txt_family;

    @FXML
    RadioButton rb_male;

    @FXML
    Label lbl_view;

    public void clickMe(ActionEvent actionEvent) {


        if (txt_name.getText().length() > 0) {
            if (txt_family.getText().length() > 0) {

                String nameFamily = txt_name.getText() + " " + txt_family.getText();
                String title = "Mr.";
                if (!rb_male.isSelected()) {
                    title = "Ms.";
                }
                lbl_view.setText(title + nameFamily);

            } else {

                Alert al = new Alert(Alert.AlertType.CONFIRMATION);
                al.setContentText("Family cannot be empty");
                al.setTitle("Fatal Error");
                al.show();


            }
        } else {

            Alert al = new Alert(Alert.AlertType.ERROR);
            al.setContentText("Name cannot be empty");
            al.setTitle("Fatal Error");
            al.show();


        }


    }
}

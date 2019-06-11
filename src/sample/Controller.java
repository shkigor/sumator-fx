package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField number1;
    public TextField number2;
    public TextField result;

    public void calculate(ActionEvent actionEvent) {
        try {
            double number1 = Double.parseDouble(this.number1.getText());
            double number2 = Double.parseDouble(this.number2.getText());

            double result = number1 + number2;
            this.result.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            this.result.setText("error");
        }
    }
}

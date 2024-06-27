package FrontEnd;

import BackEnd.Calculator;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Calculator calculator = new Calculator();
        PrimaryScreenFrame primary = new PrimaryScreenFrame(calculator);
        stage.setTitle("Calculator");
        stage.setScene(new Scene(primary, 400, 600));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
package FrontEnd;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        PrimaryScreenFrame primary = new PrimaryScreenFrame();
        stage.setTitle("Calculator");
        stage.setScene(new Scene(primary, 375, 450));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
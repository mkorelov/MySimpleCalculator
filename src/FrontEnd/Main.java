package FrontEnd;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        PrimaryFrame root = new PrimaryFrame();
        stage.setTitle("Calculator");
        stage.setScene(new Scene(root, 500, 600));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
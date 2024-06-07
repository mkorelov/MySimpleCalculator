package FrontEnd;

import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.*;

class PrimaryScreen extends GridPane {
    private GridPane grid;

    private Button clear;
    private Button negative;
    private Button percent;
    private Button decimal;
    private Button plus;
    private Button minus;
    private Button times;
    private Button divide;
    private Button equals;

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;

    // TODO: Expand to a larger screen w/ more functions
    private Button more;

    PrimaryScreen() {
        //this.setPrefSize();
        //this.setStyle();

        clear = new Button("AC");
        negative = new Button("+/-");
        percent = new Button("%");
        decimal = new Button(".");
        plus = new Button("+");
        minus = new Button("-");
        times = new Button("x");
        divide = new Button("/");
        equals = new Button("=");

        zero = new Button("0");
        one = new Button("1");
        two = new Button("2");
        three = new Button("3");
        four = new Button("4");
        five = new Button("5");
        six = new Button("6");
        seven = new Button("7");
        eight = new Button("8");
        nine = new Button("9");

        grid = new GridPane();

        grid.getColumnConstraints().add(new ColumnConstraints(100));
        grid.getColumnConstraints().add(new ColumnConstraints(100));
        grid.getColumnConstraints().add(new ColumnConstraints(100));
        grid.getColumnConstraints().add(new ColumnConstraints(100));

        grid.getRowConstraints().add(new RowConstraints(100));
        grid.getRowConstraints().add(new RowConstraints(100));
        grid.getRowConstraints().add(new RowConstraints(100));
        grid.getRowConstraints().add(new RowConstraints(100));
        grid.getRowConstraints().add(new RowConstraints(100));

        grid.add(clear, 0, 0);
        grid.add(negative, 1, 0);
        grid.add(percent, 2, 0);
        grid.add(divide, 3, 0);

        grid.add(seven, 0, 1);
        grid.add(eight, 1, 1);
        grid.add(nine, 2, 1);
        grid.add(times, 3, 1);

        grid.add(four, 0, 2);
        grid.add(five, 1, 2);
        grid.add(six, 2, 2);
        grid.add(minus, 3, 2);

        grid.add(one, 0, 3);
        grid.add(two, 1, 3);
        grid.add(three, 2, 3);
        grid.add(plus, 3, 3);

        grid.add(zero, 0, 4);
        
        grid.add(decimal, 2, 4);
        grid.add(equals, 3, 4);


        //grid.setAlignment(Pos.CENTER);
        this.getChildren().add(grid);
    }
}

class PrimaryScreenFooter extends HBox {
    PrimaryScreenFooter() {

    }
}

class PrimaryScreenHeader extends HBox {
    PrimaryScreenHeader() {

    }
}

class PrimaryScreenFrame extends BorderPane {
    private PrimaryScreen screen;

    PrimaryScreenFrame() {
        screen = new PrimaryScreen();
        this.setCenter(screen);
    }
}
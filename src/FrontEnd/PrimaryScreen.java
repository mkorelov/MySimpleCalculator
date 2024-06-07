package FrontEnd;

import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;

class PrimaryScreen extends GridPane {
    // Buttons of Calc
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
        clear.setPrefWidth(100);
        clear.setPrefHeight(100);

        negative = new Button("+/-");
        negative.setPrefWidth(100);
        negative.setPrefHeight(100);

        percent = new Button("%");
        percent.setPrefWidth(100);
        percent.setPrefHeight(100);

        decimal = new Button(".");
        decimal.setPrefWidth(100);
        decimal.setPrefHeight(100);

        plus = new Button("+");
        plus.setPrefWidth(100);
        plus.setPrefHeight(100);

        minus = new Button("-");
        minus.setPrefWidth(100);
        minus.setPrefHeight(100);

        times = new Button("x");
        times.setPrefWidth(100);
        times.setPrefHeight(100);

        divide = new Button("/");
        divide.setPrefWidth(100);
        divide.setPrefHeight(100);

        equals = new Button("=");
        equals.setPrefWidth(100);
        equals.setPrefHeight(100);

        zero = new Button("0");
        zero.setPrefWidth(100);
        zero.setPrefHeight(100);

        one = new Button("1");
        one.setPrefWidth(100);
        one.setPrefHeight(100);

        two = new Button("2");
        two.setPrefWidth(100);
        two.setPrefHeight(100);

        three = new Button("3");
        three.setPrefWidth(100);
        three.setPrefHeight(100);

        four = new Button("4");
        four.setPrefWidth(100);
        four.setPrefHeight(100);

        five = new Button("5");
        five.setPrefWidth(100);
        five.setPrefHeight(100);

        six = new Button("6");
        six.setPrefWidth(100);
        six.setPrefHeight(100);

        seven = new Button("7");
        seven.setPrefWidth(100);
        seven.setPrefHeight(100);

        eight = new Button("8");
        eight.setPrefWidth(100);
        eight.setPrefHeight(100);

        nine = new Button("9");
        nine.setPrefWidth(100);
        nine.setPrefHeight(100);


        more = new Button("More");
        more.setPrefWidth(100);
        more.setPrefHeight(100);

        this.getColumnConstraints().add(new ColumnConstraints(100));
        this.getColumnConstraints().add(new ColumnConstraints(100));
        this.getColumnConstraints().add(new ColumnConstraints(100));
        this.getColumnConstraints().add(new ColumnConstraints(100));

        this.getRowConstraints().add(new RowConstraints(100));
        this.getRowConstraints().add(new RowConstraints(100));
        this.getRowConstraints().add(new RowConstraints(100));
        this.getRowConstraints().add(new RowConstraints(100));
        this.getRowConstraints().add(new RowConstraints(100));

        this.add(more, 0, 0);
        this.add(clear, 1, 0);
        this.add(negative, 2, 0);
        this.add(divide, 3, 0);

        this.add(seven, 0, 1);
        this.add(eight, 1, 1);
        this.add(nine, 2, 1);
        this.add(times, 3, 1);

        this.add(four, 0, 2);
        this.add(five, 1, 2);
        this.add(six, 2, 2);
        this.add(minus, 3, 2);

        this.add(one, 0, 3);
        this.add(two, 1, 3);
        this.add(three, 2, 3);
        this.add(plus, 3, 3);

        this.add(zero, 0, 4);
        this.add(decimal, 1, 4);
        this.add(percent, 2, 4);
        this.add(equals, 3, 4);

        //this.getChildren().add();
    }
}

class PrimaryScreenHeader extends HBox {
    // Display of Calc
    PrimaryScreenHeader() {

    }
}

class PrimaryScreenFrame extends BorderPane {
    private PrimaryScreenHeader display;
    private PrimaryScreen buttons;

    PrimaryScreenFrame() {
        display = new PrimaryScreenHeader();
        buttons = new PrimaryScreen();

        this.setTop(display);
        this.setBottom(buttons);
    }
}
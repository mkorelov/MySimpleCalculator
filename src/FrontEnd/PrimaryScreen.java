package FrontEnd;

import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;

class PrimaryScreen extends VBox {
    private Button clear;
    private Button negative;
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
    PrimaryScreenFrame() {

    }
}
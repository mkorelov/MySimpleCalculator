package FrontEnd;

import BackEnd.Calculator;

import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import java.io.File;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;

// Calculator Buttons
class PrimaryScreen extends GridPane {
    private Button more;
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

    PrimaryScreen() {
        this.setPrefSize(400,500);
        //this.setStyle();

        String path = "src/expand.png";
        Image image = new Image(new File(path).toURI().toString());
        ImageView view = new ImageView(image);
        view.setFitWidth(40);
        view.setFitHeight(40);

        more = new Button();
        more.setGraphic(view);
        more.setPrefWidth(100);
        more.setPrefHeight(100);

        clear = new Button("AC");
        clear.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        clear.setPrefWidth(100);
        clear.setPrefHeight(100);

        negative = new Button("+/-");
        negative.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        negative.setPrefWidth(100);
        negative.setPrefHeight(100);

        percent = new Button("%");
        percent.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        percent.setPrefWidth(100);
        percent.setPrefHeight(100);

        decimal = new Button(".");
        decimal.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        decimal.setPrefWidth(100);
        decimal.setPrefHeight(100);

        plus = new Button("+");
        plus.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        plus.setPrefWidth(100);
        plus.setPrefHeight(100);

        minus = new Button("-");
        minus.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        minus.setPrefWidth(100);
        minus.setPrefHeight(100);

        times = new Button("x");
        times.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        times.setPrefWidth(100);
        times.setPrefHeight(100);

        divide = new Button("/");
        divide.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        divide.setPrefWidth(100);
        divide.setPrefHeight(100);

        equals = new Button("=");
        equals.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        equals.setPrefWidth(100);
        equals.setPrefHeight(100);

        zero = new Button("0");
        zero.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        zero.setPrefWidth(100);
        zero.setPrefHeight(100);

        one = new Button("1");
        one.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        one.setPrefWidth(100);
        one.setPrefHeight(100);

        two = new Button("2");
        two.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        two.setPrefWidth(100);
        two.setPrefHeight(100);

        three = new Button("3");
        three.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        three.setPrefWidth(100);
        three.setPrefHeight(100);

        four = new Button("4");
        four.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        four.setPrefWidth(100);
        four.setPrefHeight(100);

        five = new Button("5");
        five.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        five.setPrefWidth(100);
        five.setPrefHeight(100);

        six = new Button("6");
        six.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        six.setPrefWidth(100);
        six.setPrefHeight(100);

        seven = new Button("7");
        seven.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        seven.setPrefWidth(100);
        seven.setPrefHeight(100);

        eight = new Button("8");
        eight.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        eight.setPrefWidth(100);
        eight.setPrefHeight(100);

        nine = new Button("9");
        nine.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        nine.setPrefWidth(100);
        nine.setPrefHeight(100);

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
    }

    Button getMoreButton() {
        return this.more;
    } 

    Button getClearButton() {
        return this.clear;
    }

    Button getNegativeButton() {
        return this.negative;
    }

    Button getPercentButton() {
        return this.percent;
    }

    Button getDecimalButton() {
        return this.decimal;
    }

    Button getPlusButton() {
        return this.plus;
    }

    Button getMinusButton() {
        return this.minus;
    }

    Button getTimesButton() {
        return this.times;
    }

    Button getDivideButton() {
        return this.divide;
    }

    Button getEqualsButton() {
        return this.equals;
    }

    Button getZeroButton() {
        return this.zero;
    }
    
    Button getOneButton() {
        return this.one;
    }

    Button getTwoButton() {
        return this.two;
    }

    Button getThreeButton() {
        return this.three;
    }

    Button getFourButton() {
        return this.four;
    }

    Button getFiveButton() {
        return this.five;
    }

    Button getSixButton() {
        return this.six;
    }

    Button getSevenButton() {
        return this.seven;
    }

    Button getEightButton() {
        return this.eight;
    }

    Button getNineButton() {
        return this.nine;
    }
}

// Calculator Display
class PrimaryScreenHeader extends HBox {
    PrimaryScreenHeader(String s) {
        this.setPrefSize(400,100);
        //this.setStyle();

        Text text = new Text(s);
        text.setFont(Font.font("Arial", FontWeight.BOLD, 70));
        this.getChildren().add(text);
        this.setAlignment(Pos.BOTTOM_RIGHT);
    }
}

// Calculator UI
class PrimaryScreenFrame extends BorderPane {
    private PrimaryScreenHeader display;
    private PrimaryScreen buttons;
    private Calculator calculator;
    
    private Button moreButton;
    private Button clearButton;
    private Button negativeButton;
    private Button percentButton;
    private Button decimalButton;
    private Button plusButton;
    private Button minusButton;
    private Button timesButton;
    private Button divideButton;
    private Button equalsButton;
    private Button zeroButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;

    PrimaryScreenFrame(Calculator calc) {
        calculator = calc;
        display = new PrimaryScreenHeader(calculator.getCurrent());
        buttons = new PrimaryScreen();

        this.setTop(display);
        this.setBottom(buttons);

        moreButton = buttons.getMoreButton();
        clearButton = buttons.getClearButton();
        negativeButton = buttons.getNegativeButton();
        percentButton = buttons.getPercentButton();
        decimalButton = buttons.getDecimalButton();
        plusButton = buttons.getPlusButton();
        minusButton = buttons.getMinusButton();
        timesButton = buttons.getTimesButton();
        divideButton = buttons.getDivideButton();
        equalsButton = buttons.getEqualsButton();
        zeroButton = buttons.getZeroButton();
        oneButton = buttons.getOneButton();
        twoButton = buttons.getTwoButton();
        threeButton = buttons.getThreeButton();
        fourButton = buttons.getFourButton();
        fiveButton = buttons.getFiveButton();
        sixButton = buttons.getSixButton();
        sevenButton = buttons.getSevenButton();
        eightButton = buttons.getEightButton();
        nineButton = buttons.getNineButton();

        addListeners();
    }

    public void addListeners() {
        moreButton.setOnAction(e -> {
            Stage stage = (Stage) moreButton.getScene().getWindow();
            SecondaryScreenFrame primary = new SecondaryScreenFrame(calculator);
            stage.setTitle("Calculator");
            stage.setScene(new Scene(primary, 700, 600));
            stage.setResizable(false);
            stage.show();
        });

        clearButton.setOnAction(e -> {
            calculator.clear();
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        negativeButton.setOnAction(e -> {
            calculator.negate();
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        percentButton.setOnAction(e -> {
            calculator.percent();
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        decimalButton.setOnAction(e -> {
            calculator.decimal();
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        plusButton.setOnAction(e -> {
            calculator.add();
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        minusButton.setOnAction(e -> {
            calculator.subtract();
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        timesButton.setOnAction(e -> {
            calculator.multiply();
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        divideButton.setOnAction(e -> {
            calculator.divide();
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        equalsButton.setOnAction(e -> {
            calculator.equals();
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        zeroButton.setOnAction(e -> {
            calculator.enterDigit("0");
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        oneButton.setOnAction(e -> {
            calculator.enterDigit("1");
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        twoButton.setOnAction(e -> {
            calculator.enterDigit("2");
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        threeButton.setOnAction(e -> {
            calculator.enterDigit("3");
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        fourButton.setOnAction(e -> {
            calculator.enterDigit("4");
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        fiveButton.setOnAction(e -> {
            calculator.enterDigit("5");
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        sixButton.setOnAction(e -> {
            calculator.enterDigit("6");
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        sevenButton.setOnAction(e -> {
            calculator.enterDigit("7");
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        eightButton.setOnAction(e -> {
            calculator.enterDigit("8");
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });
        
        nineButton.setOnAction(e -> {
            calculator.enterDigit("9");
            display = new PrimaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });
    }
}
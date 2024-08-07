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

class SecondaryScreen extends GridPane {
    private Button less;
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
    private Button sine;
    private Button cosine;
    private Button tangent;
    private Button arcsine;
    private Button arccosine;
    private Button arctangent;
    private Button exponent;
    private Button root;
    private Button logarithm;
    private Button natural_log;
    private Button factorial;
    private Button eulers_exp;
    private Button random;
    private Button euler_num;
    private Button pi;

    SecondaryScreen() {
        less = new Button("Less");
        less.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        less.setPrefWidth(100);
        less.setPrefHeight(100);

        clear = new Button("C");
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

        sine = new Button("sin");
        sine.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        sine.setPrefWidth(100);
        sine.setPrefHeight(100);

        cosine = new Button("cos");
        cosine.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        cosine.setPrefWidth(100);
        cosine.setPrefHeight(100);

        tangent = new Button("tan");
        tangent.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        tangent.setPrefWidth(100);
        tangent.setPrefHeight(100);

        arcsine = new Button("sin^-1");
        arcsine.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        arcsine.setPrefWidth(100);
        arcsine.setPrefHeight(100);

        arccosine = new Button("cos^-1");
        arccosine.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        arccosine.setPrefWidth(100);
        arccosine.setPrefHeight(100);

        arctangent = new Button("tan^-1");
        arctangent.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        arctangent.setPrefWidth(100);
        arctangent.setPrefHeight(100);
    
        exponent = new Button("x^y");
        exponent.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        exponent.setPrefWidth(100);
        exponent.setPrefHeight(100);

        root = new Button("sqrt(x)");
        root.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        root.setPrefWidth(100);
        root.setPrefHeight(100);

        logarithm = new Button("log_x");
        logarithm.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        logarithm.setPrefWidth(100);
        logarithm.setPrefHeight(100);

        natural_log = new Button("ln");
        natural_log.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        natural_log.setPrefWidth(100);
        natural_log.setPrefHeight(100);

        factorial = new Button("x!");
        factorial.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        factorial.setPrefWidth(100);
        factorial.setPrefHeight(100);

        eulers_exp = new Button("e^x");
        eulers_exp.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        eulers_exp.setPrefWidth(100);
        eulers_exp.setPrefHeight(100);

        random = new Button("rand");
        random.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        random.setPrefWidth(100);
        random.setPrefHeight(100);

        euler_num = new Button("e");
        euler_num.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        euler_num.setPrefWidth(100);
        euler_num.setPrefHeight(100);

        pi = new Button("pi");
        pi.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        pi.setPrefWidth(100);
        pi.setPrefHeight(100);

        this.getColumnConstraints().add(new ColumnConstraints(100));
        this.getColumnConstraints().add(new ColumnConstraints(100));
        this.getColumnConstraints().add(new ColumnConstraints(100));
        this.getColumnConstraints().add(new ColumnConstraints(100));
        this.getColumnConstraints().add(new ColumnConstraints(100));
        this.getColumnConstraints().add(new ColumnConstraints(100));
        this.getColumnConstraints().add(new ColumnConstraints(100));

        this.getRowConstraints().add(new RowConstraints(100));
        this.getRowConstraints().add(new RowConstraints(100));
        this.getRowConstraints().add(new RowConstraints(100));
        this.getRowConstraints().add(new RowConstraints(100));
        this.getRowConstraints().add(new RowConstraints(100));

        this.add(exponent, 0, 0);
        this.add(root, 1, 0);
        this.add(logarithm, 2, 0);
        this.add(less, 3, 0);
        this.add(clear, 4, 0);
        this.add(negative, 5, 0);
        this.add(divide, 6, 0);

        this.add(random, 0, 1);
        this.add(factorial, 1, 1);
        this.add(natural_log, 2, 1);
        this.add(seven, 3, 1);
        this.add(eight, 4, 1);
        this.add(nine, 5, 1);
        this.add(times, 6, 1);

        this.add(pi, 0, 2);
        this.add(euler_num, 1, 2);
        this.add(eulers_exp, 2, 2);
        this.add(four, 3, 2);
        this.add(five, 4, 2);
        this.add(six, 5, 2);
        this.add(minus, 6, 2);

        this.add(sine, 0, 3);
        this.add(cosine, 1, 3);
        this.add(tangent, 2, 3);
        this.add(one, 3, 3);
        this.add(two, 4, 3);
        this.add(three, 5, 3);
        this.add(plus, 6, 3);

        this.add(arcsine, 0, 4);
        this.add(arccosine, 1, 4);
        this.add(arctangent, 2, 4);
        this.add(zero, 3, 4);
        this.add(decimal, 4, 4);
        this.add(percent, 5, 4);
        this.add(equals, 6, 4);
    }

    Button getLessButton() {
        return this.less;
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

    Button getSineButton() {
        return this.sine;
    }

    Button getCosineButton() {
        return this.cosine;
    }

    Button getTangentButton() {
        return this.tangent;
    }

    Button getArcsineButton() {
        return this.arcsine;
    }

    Button getArccosineButton() {
        return this.arccosine;
    }

    Button getArctangentButton() {
        return this.arctangent;
    }

    Button getExponentButton() {
        return this.exponent;
    }

    Button getRootButton() {
        return this.root;
    }

    Button getLogarithmButton() {
        return this.logarithm;
    }

    Button getNatural_logButton() {
        return this.natural_log;
    }

    Button getFactorialButton() {
        return this.factorial;
    }

    Button getEulers_expButton() {
        return this.eulers_exp;
    }

    Button getRandomButton() {
        return this.random;
    }

    Button getEuler_numButton() {
        return this.euler_num;
    }

    Button getPiButton() {
        return this.pi;
    }
}

class SecondaryScreenHeader extends HBox{
    SecondaryScreenHeader(String s) {
        this.setPrefSize(400,100);

        Text text = new Text(s);
        text.setFont(Font.font("Arial", FontWeight.BOLD, 70));
        this.getChildren().add(text);
        this.setAlignment(Pos.BOTTOM_RIGHT);
    }
}

class SecondaryScreenFrame extends BorderPane {
    private SecondaryScreenHeader display;
    private SecondaryScreen buttons;
    private Calculator calculator;

    private Button lessButton;
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
    private Button sineButton;
    private Button cosineButton;
    private Button tangentButton;
    private Button arcsineButton;
    private Button arccosineButton;
    private Button arctangentButton;
    private Button exponentButton;
    private Button rootButton;
    private Button logarithmButton;
    private Button natural_logButton;
    private Button factorialButton;
    private Button eulers_expButton;
    private Button randomButton;
    private Button euler_numButton;
    private Button piButton;

    SecondaryScreenFrame(Calculator calc) {
        calculator = calc;
        display = new SecondaryScreenHeader(calculator.getCurrent());
        buttons = new SecondaryScreen();

        this.setTop(display);
        this.setBottom(buttons);

        lessButton = buttons.getLessButton();
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
        sineButton = buttons.getSineButton();
        cosineButton = buttons.getCosineButton();
        tangentButton = buttons.getTangentButton();
        arcsineButton = buttons.getArcsineButton();
        arccosineButton = buttons.getArccosineButton();
        arctangentButton = buttons.getArctangentButton();
        exponentButton = buttons.getExponentButton();
        rootButton = buttons.getRootButton();
        logarithmButton = buttons.getLogarithmButton();
        natural_logButton = buttons.getNatural_logButton();
        factorialButton = buttons.getFactorialButton();
        eulers_expButton = buttons.getEulers_expButton();
        randomButton = buttons.getRandomButton();
        euler_numButton = buttons.getEuler_numButton();
        piButton = buttons.getPiButton();

        addListeners();
    }

    public void addListeners() {
        lessButton.setOnAction(e -> {
            Stage stage = (Stage) lessButton.getScene().getWindow();
            PrimaryScreenFrame primary = new PrimaryScreenFrame(calculator);
            stage.setTitle("Calculator");
            stage.setScene(new Scene(primary, 400, 600));
            stage.setResizable(false);
            stage.show();
        });

        clearButton.setOnAction(e -> {
            calculator.clear();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        negativeButton.setOnAction(e -> {
            calculator.negate();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        percentButton.setOnAction(e -> {
            calculator.percentTwo();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        decimalButton.setOnAction(e -> {
            calculator.decimalTwo();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        plusButton.setOnAction(e -> {
            calculator.add();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        minusButton.setOnAction(e -> {
            calculator.subtract();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        timesButton.setOnAction(e -> {
            calculator.multiply();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        divideButton.setOnAction(e -> {
            calculator.divide();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        equalsButton.setOnAction(e -> {
            calculator.equalsTwo();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        zeroButton.setOnAction(e -> {
            calculator.digitTwo("0");
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        oneButton.setOnAction(e -> {
            calculator.digitTwo("1");
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        twoButton.setOnAction(e -> {
            calculator.digitTwo("2");
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        threeButton.setOnAction(e -> {
            calculator.digitTwo("3");
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        fourButton.setOnAction(e -> {
            calculator.digitTwo("4");
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        fiveButton.setOnAction(e -> {
            calculator.digitTwo("5");
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        sixButton.setOnAction(e -> {
            calculator.digitTwo("6");
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        sevenButton.setOnAction(e -> {
            calculator.digitTwo("7");
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        eightButton.setOnAction(e -> {
            calculator.digitTwo("8");
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });
        
        nineButton.setOnAction(e -> {
            calculator.digitTwo("9");
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);
        });

        sineButton.setOnAction(e -> {
            /*calculator.sine();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);*/
        });

        cosineButton.setOnAction(e -> {
            /*calculator.cosine();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);*/
        });

        tangentButton.setOnAction(e -> {
            /*calculator.tangent();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);*/
        });

        arcsineButton.setOnAction(e -> {
            /*calculator.arcsine();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);*/
        });

        arccosineButton.setOnAction(e -> {
            /*calculator.arccosine();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);*/
        });

        arctangentButton.setOnAction(e -> {
            /*calculator.arctangent();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);*/
        });

        exponentButton.setOnAction(e -> {
            
        });

        rootButton.setOnAction(e -> {
            
        });

        logarithmButton.setOnAction(e -> {
            
        });

        natural_logButton.setOnAction(e -> {
            
        });

        factorialButton.setOnAction(e -> {
            /*calculator.factorial();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);*/
        });

        eulers_expButton.setOnAction(e -> {
            
        });

        randomButton.setOnAction(e -> {
            
        });

        euler_numButton.setOnAction(e -> {
            /*calculator.enterEuler();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);*/
        });

        piButton.setOnAction(e -> {
            /*calculator.enterPi();
            display = new SecondaryScreenHeader(calculator.getCurrent());
            this.setTop(display);*/
        });
    }
}
package BackEnd;

import java.math.*;

// Calculator Logic
public class Calculator {
    String current;     // stores the current number on display
    boolean decimal;    // flag that indicates if number is already decimal
    boolean negative;   // flag that indicates if number is already negative
    int num_chars;      // stores the number of digits on display
    String operation;   // stores the most recent operation pressed
    String previous;    // stores the number before an operation was pressed

    public Calculator() {
        current = "0";
        decimal = false;
        negative = false;
        num_chars = 1;
        operation = "";
        previous = "";
    }

    // returns the number that needs to be displayed by UI
    public String getCurrent() {
        return current;
    }

    // add a number to the display
    public void enterDigit(String num) {
        if (current.equals("Error")) {
            return;
        }

        if (num_chars >= 10 || (num_chars == 9 && negative == false)) {
            return;
        }

        if (current.equals("0")) {
            current = num;
        } else if (current.equals("-0")) {
            current = "-" + num;
        } else {
            current = current + num;
            num_chars += 1;
        }
    }

    // negates current number on display
    public void negate() {
        if (current.equals("Error")) {
            return;
        }

        if (negative == false) {
            current = "-" + current;
            negative = true;
            num_chars += 1;
        } else if (negative == true) {
            current = current.substring(1, current.length());
            negative = false;
            num_chars -= 1;
        }
    }

    // adds a decimal point if one hasn't been added
    public void decimal() {
        if (current.equals("Error")) {
            return;
        }

        if (num_chars >= 10 || (num_chars == 9 && negative == false)) {
            return;
        }

        if (decimal == false) {
            current = current + ".";
            decimal = true;
        }
    }

    public void percent() {
        if (current.equals("Error")) {
            return;
        }

        if (current.equals("0")) {
            return;
        }
        String s = Double.toString(Double.valueOf(current)/100);
        if (s.length() >= 10 || (s.length() == 9 && negative == false)) {
            current = "Error";
            return;
        }
        current = Double.toString(Double.valueOf(current)/100);

        if (Double.valueOf(current) % 1 != 0) {
            decimal = true;
        } else {
            current = Integer.toString((int) Math.round(Double.valueOf(current)));
            decimal = false;
        }
        if (current.charAt(0) == '-') {
            negative = true;
        } else {
            negative = false;
        }
    }

    public void clear() {
        current = "0";
        decimal = false;
        negative = false;
        num_chars = 1;
        operation = "";
        previous = "";
    }

    public void add() {
        if (current.equals("Error")) {
            return;
        }

        if (operation.equals("")) {
            previous = current;
            current = "0";
            decimal = false;
            negative = false;
            num_chars = 1;
        }
        operation = "add";
    }

    public void subtract() {
        if (current.equals("Error")) {
            return;
        }

        if (operation.equals("")) {
            previous = current;
            current = "0";
            decimal = false;
            negative = false;
            num_chars = 1;
        }
        operation = "subtract";
    }

    public void multiply() {
        if (current.equals("Error")) {
            return;
        }

        if (operation.equals("")) {
            previous = current;
            current = "0";
            decimal = false;
            negative = false;
            num_chars = 1;
        }
        operation = "multiply";
    }

    public void divide() {
        if (current.equals("Error")) {
            return;
        }

        if (operation.equals("")) {
            previous = current;
            current = "0";
            decimal = false;
            negative = false;
            num_chars = 1;
        }
        operation = "divide";
    }

    public void equals() {
        if (current.equals("Error")) {
            return;
        }

        if (operation.equals("add")) {
            String s = Double.toString(Double.valueOf(previous) + Double.valueOf(current));
            if (s.length() >= 10 || (s.length() == 9 && negative == false)) {
                current = "Error";
                return;
            }

            current = Double.toString(Double.valueOf(previous) + Double.valueOf(current));
            if (Double.valueOf(current) % 1 != 0) {
                decimal = true;
            } else {
                current = Integer.toString((int) Math.round(Double.valueOf(current)));
                decimal = false;
            }
            if (current.charAt(0) == '-') {
                negative = true;
            } else {
                negative = false;
            }
            previous = "";
            operation = "";
        } else if (operation.equals("subtract")) {
            String s = Double.toString(Double.valueOf(previous) - Double.valueOf(current));
            if (s.length() >= 10 || (s.length() == 9 && negative == false)) {
                current = "Error";
                return;
            }

            current = Double.toString(Double.valueOf(previous) - Double.valueOf(current));
            if (Double.valueOf(current) % 1 != 0) {
                decimal = true;
            } else {
                current = Integer.toString((int) Math.round(Double.valueOf(current)));
                decimal = false;
            }
            if (current.charAt(0) == '-') {
                negative = true;
            } else {
                negative = false;
            }
            previous = "";
            operation = "";
        } else if (operation.equals("multiply")) {
            String s = Double.toString(Double.valueOf(previous) * Double.valueOf(current));
            if (s.length() >= 10 || (s.length() == 9 && negative == false)) {
                current = "Error";
                return;
            }

            current = Double.toString(Double.valueOf(previous) * Double.valueOf(current));
            if (Double.valueOf(current) % 1 != 0) {
                decimal = true;
            } else {
                current = Integer.toString((int) Math.round(Double.valueOf(current)));
                decimal = false;
            }
            if (current.charAt(0) == '-') {
                negative = true;
            } else {
                negative = false;
            }
            previous = "";
            operation = "";
        } else if (operation.equals("divide")) {
            String s = Double.toString(Double.valueOf(previous) / Double.valueOf(current));
            if (s.length() >= 10 || (s.length() == 9 && negative == false)) {
                current = "Error";
                return;
            }

            current = Double.toString(Double.valueOf(previous) / Double.valueOf(current));
            if (Double.valueOf(current) % 1 != 0) {
                decimal = true;
            } else {
                current = Integer.toString((int) Math.round(Double.valueOf(current)));
                decimal = false;
            }
            if (current.charAt(0) == '-') {
                negative = true;
            } else {
                negative = false;
            }
            previous = "";
            operation = "";
        }
    }



    // IGNORE for now
    // SecondaryScreen Functions Only
    public void factorial() {
        if (current.equals("0") || decimal == true || negative == true) {
            return;
        }
        
        int num = 1;
        for (int i = 2; i <= Integer.valueOf(current); i++) {
            num = num * i;
        }
        String s = Integer.toString(num);

        if (s.length() >= 20 || (s.length() == 19 && negative == false) || s.equals("0")) {
            return;
        } else {
            current = s;
        }
    }

    public void sine() {
        String s = Double.toString(Math.sin(Double.valueOf(current)));
        if (s.length() >= 20 || (s.length() == 19 && negative == false)) {
            return;
        }
        current = s;
        if (Double.valueOf(current) % 1 != 0) {
            decimal = true;
        } else {
            current = Integer.toString((int) Math.round(Double.valueOf(current)));
            decimal = false;
        }
        if (current.charAt(0) == '-') {
            negative = true;
        } else {
            negative = false;
        } 
    }

    public void cosine() {
        String s = Double.toString(Math.cos(Double.valueOf(current)));
        if (s.length() >= 20 || (s.length() == 19 && negative == false)) {
            return;
        }
        current = s;
        if (Double.valueOf(current) % 1 != 0) {
            decimal = true;
        } else {
            current = Integer.toString((int) Math.round(Double.valueOf(current)));
            decimal = false;
        }
        if (current.charAt(0) == '-') {
            negative = true;
        } else {
            negative = false;
        } 
    }

    public void tangent() {
        String s = Double.toString(Math.tan(Double.valueOf(current)));
        if (s.length() >= 20 || (s.length() == 19 && negative == false)) {
            return;
        }
        current = s;
        if (Double.valueOf(current) % 1 != 0) {
            decimal = true;
        } else {
            current = Integer.toString((int) Math.round(Double.valueOf(current)));
            decimal = false;
        }
        if (current.charAt(0) == '-') {
            negative = true;
        } else {
            negative = false;
        } 
    }

    public void arcsine() {
        String s = Double.toString(Math.asin(Double.valueOf(current)));
        if (s.length() >= 20 || (s.length() == 19 && negative == false)) {
            return;
        }
        current = s;
        if (Double.valueOf(current) % 1 != 0) {
            decimal = true;
        } else {
            current = Integer.toString((int) Math.round(Double.valueOf(current)));
            decimal = false;
        }
        if (current.charAt(0) == '-') {
            negative = true;
        } else {
            negative = false;
        } 
    }

    public void arccosine() {
        String s = Double.toString(Math.acos(Double.valueOf(current)));
        if (s.length() >= 20 || (s.length() == 19 && negative == false)) {
            return;
        }
        current = s;
        if (Double.valueOf(current) % 1 != 0) {
            decimal = true;
        } else {
            current = Integer.toString((int) Math.round(Double.valueOf(current)));
            decimal = false;
        }
        if (current.charAt(0) == '-') {
            negative = true;
        } else {
            negative = false;
        } 
    }

    public void arctangent() {
        String s = Double.toString(Math.atan(Double.valueOf(current)));
        if (s.length() >= 20 || (s.length() == 19 && negative == false)) {
            return;
        }
        current = s;
        if (Double.valueOf(current) % 1 != 0) {
            decimal = true;
        } else {
            current = Integer.toString((int) Math.round(Double.valueOf(current)));
            decimal = false;
        }
        if (current.charAt(0) == '-') {
            negative = true;
        } else {
            negative = false;
        } 
    }

    public void enterEuler() {
        current = "2.718281828459045";
    }

    public void enterPi() {
        current = "3.141592653589793";
    }
}
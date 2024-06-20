package BackEnd;

public class Calculator {
    String current; // a member variable that keeps the current number on display and updates the UI
    boolean decimal;    // flag that indicates if number is already decimal
    boolean negative;   // flag that indicates if number is already negative
    int num_chars;    // number of digits on display; reserve one for negative sign
    String operation;   // current active operation
    String previous;    // member variable that stores the number before an operation was pressed

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
        if (num_chars == 10 || (num_chars == 9 && negative == false)) {
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
        if (num_chars == 10) {
            return;
        }

        if (decimal == false) {
            current = current + ".";
            decimal = true;
        }
    }

    public void percent() {
        if (current.equals("0")) {
            return;
        }
        String s = Double.toString(Double.valueOf(current)/100);
        if (s.length() >= 10 || (s.length() == 9 && negative == false)) {
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

    // clears numbers on display
    // currently just resets calc to original settings for testing
    public void clear() {
        current = "0";
        decimal = false;
        negative = false;
        num_chars = 1;
        operation = "";
        previous = "";
    }

    public void add() {
        if (operation.equals("")) {
            previous = current;
            current = "0";
            decimal = false;
            negative = false;
        }
        operation = "add";
    }

    public void subtract() {
        if (operation.equals("")) {
            previous = current;
            current = "0";
            decimal = false;
            negative = false;
        }
        operation = "subtract";
    }

    public void multiply() {
        if (operation.equals("")) {
            previous = current;
            current = "0";
            decimal = false;
            negative = false;
        }
        operation = "multiply";
    }

    public void divide() {
        if (operation.equals("")) {
            previous = current;
            current = "0";
            decimal = false;
            negative = false;
        }
        operation = "divide";
    }

    public void equals() {
        if (operation.equals("add")) {
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
}
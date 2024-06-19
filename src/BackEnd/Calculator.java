package BackEnd;

// Does majority of logic and calcuations
public class Calculator {
    String current; // used for the display and uses stringbuilder or just append +  or eventually just use 10*n and add to an int
    boolean decimal;    // flag that indicates if number is already decimal
    boolean negative;   // flag that indicates if number is already negative
    int num_chars;    // number of digits on display; reserve one for negative sign
    String operation;
    String previous;
    // if decimal == true convert to float otherwise just use int

    //String previous;
    // a member variable that keeps the current number on display and updates the UI

    // another member variable that stores the number before an operation was pressed
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
    }

    // clears numbers on display
    public void clear() {
        // currently just resets calc to original settings for testing
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
        }
        operation = "add";
    }

    public void subtract() {
        if (operation.equals("")) {
            previous = current;
            current = "0";
        }
        operation = "subtract";
    }

    public void multiply() {
        if (operation.equals("")) {
            previous = current;
            current = "0";
        }
        operation = "multiply";
    }

    public void divide() {
        if (operation.equals("")) {
            previous = current;
            current = "0";
        }
        operation = "divide";
    }

    public void equals() {
        if (operation.equals("add")) {
            if (decimal == true) {
                current = Double.toString(Double.valueOf(previous) + Double.valueOf(current));
            } else {
                current = Integer.toString(Integer.valueOf(previous) + Integer.valueOf(current));
            }
            previous = "";
            operation = "";
        } else if (operation.equals("subtract")) {
            if (decimal == true) {
                current = Double.toString(Double.valueOf(previous) - Double.valueOf(current));
            } else {
                current = Integer.toString(Integer.valueOf(previous) - Integer.valueOf(current));
            }
            previous = "";
            operation = "";
        } else if (operation.equals("multiply")) {
            if (decimal == true) {
                current = Double.toString(Double.valueOf(previous) * Double.valueOf(current));
            } else {
                current = Integer.toString(Integer.valueOf(previous) * Integer.valueOf(current));
            }
            previous = "";
            operation = "";
        } else if (operation.equals("divide")) {
            if (decimal == true) {
                current = Double.toString(Double.valueOf(previous) / Double.valueOf(current));
            } else {
                current = Integer.toString(Integer.valueOf(previous) / Integer.valueOf(current));
            }
            previous = "";
            operation = "";
        }
        else { // operation.equals("")

        }
    }
}
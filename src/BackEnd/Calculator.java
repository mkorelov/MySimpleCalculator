package BackEnd;

// Does majority of logic and calcuations
public class Calculator {
    String current; // used for the display and uses stringbuilder or just append +  or eventually just use 10*n and add to an int
    boolean decimal;    // flag that indicates if number is already decimal
    boolean negative;
    // if decimal == true convert to float otherwise just use int

    //String previous;
    //int number;     // used for the math and logic of the operations on the backend
    // a member variable that keeps the current number on display and updates the UI

    // another member variable that stores the number before an operation was pressed
    public Calculator() {
        current = "0";
        decimal = false;
        negative = false;
        //number = 0;
    }

    // returns the number that needs to be displayed by UI
    public String getCurrent() {
        return current;
    }

    // add a number to the display
    public void enterDigit(String num) {
        if (current.equals("0")) {
            current = num;
        } else {
            current = current + num;
        }
    }


    public void negate() {
        if (negative == false && !current.equals("0")) {
            current = "-" + current;
            negative = true;
        } else if (negative == true) {
            current = current.substring(1, current.length());
            negative = false;
        }
    }

    // adds a decimal point if one hasn't been added
    public void decimal() {
        if (decimal == false) {
            current = current + ".";
            decimal = true;
        }
    }

    // clears numbers on display
    public void clear() {
        
    }
}
package BackEnd;

// Does majority of logic and calcuations
public class Calculator {
    String current; // used for the display and uses stringbuilder or just append +  or eventually just use 10*n and add to an int
    String previous;
    int number;     // used for the math and logic of the operations on the backend
    // a member variable that keeps the current number on display and updates the UI

    // another member variable that stores the number before an operation was pressed
    public Calculator() {
        current = "0";
        number = 0;
    }

    // returns the number that needs to be displayed by UI
    public String get() {
        return current;
    }

    // clears numbers on display
    public void clear() {
        
    }

    // add a number to the display
    public void enter(int n) {

    }
}
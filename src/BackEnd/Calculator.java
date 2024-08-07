package BackEnd;

import java.math.*;

public class Calculator {
    String current;
    boolean decimal;
    boolean negative;
    int num_chars;
    int num_digits;
    String operation;
    String previous;

    public Calculator() {
        current = "0";
        decimal = false;
        negative = false;
        num_chars = 1;
        num_digits = 1;
        operation = "";
        previous = "";
    }

    // Primary & Secondary Screen Functions
    public String getCurrent() {
        return current;
    }

    public void clear() {
        current = "0";
        decimal = false;
        negative = false;
        num_chars = 1;
        num_digits = 1;
        operation = "";
        previous = "";
    }

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
            num_digits = 1;
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
            num_digits = 1;
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
            num_digits = 1;
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
            num_digits = 1;
        }
        operation = "divide";
    }

    // Primary Screen Functions
    public void digitOne(String num) {
        if (current.equals("Error") || num_chars >= 11 || num_digits >= 9) {
            return;
        }

        if (current.equals("0")) {
            current = num;
        } else if (current.equals("-0")) {
            current = "-" + num;
        } else {
            current = current + num;
            num_chars += 1;
            num_digits += 1;
        }
    }

    public void decimalOne() {
        if (current.equals("Error") || num_digits >= 9) {
            return;
        }

        if (decimal == false) {
            current = current + ".";
            decimal = true;
            num_chars += 1;
        }
    }

    public void percentOne() {
        if (current.equals("Error") || current.equals("0")) {
            return;
        }

        String s = Double.toString(Double.valueOf(current)/100);
        BigDecimal bd = new BigDecimal(s);
        String ss = bd.toPlainString();

        int num_digs = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                num_digs += 1;
            }
        }

        if (ss.length() > 11 || num_digs > 9) {
            if (ss.contains(".")) {
                int count = 0;
                for (int i = 0; i < ss.length(); i++) {
                    if (ss.charAt(i) == '.') {
                        break;
                    } else {
                        count += 1;
                    }
                }

                if (count > 9) {
                    current = "Error";
                    return;
                } else {
                    ss = ss.substring(0,10);
                    num_digits = 0;
                    num_chars = 0;
                    for (int i = 0; i < ss.length(); i++) {
                        if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                            num_digits += 1;
                        }
                        num_chars += 1;
                    }
                }
            } else {
                current = "Error";
                return;
            }
        }
        current = ss;

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

    public void equalsOne() {
        if (current.equals("Error")) {
            return;
        }

        if (operation.equals("add")) {
            String s = Double.toString(Double.valueOf(previous) + Double.valueOf(current));
            BigDecimal bd = new BigDecimal(s);
            String ss = bd.toPlainString();

            int num_digs = 0;
            for (int i = 0; i < ss.length(); i++) {
                if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                    num_digs += 1;
                }
            }

            if (ss.length() > 11 || num_digs > 9) {
                if (ss.contains(".")) {
                    int count = 0;
                    for (int i = 0; i < ss.length(); i++) {
                        if (ss.charAt(i) == '.') {
                            break;
                        } else {
                            count += 1;
                        }
                    }
    
                    if (count > 9) {
                        current = "Error";
                        return;
                    } else {
                        ss = ss.substring(0,10);
                        num_digits = 0;
                        num_chars = 0;
                        for (int i = 0; i < ss.length(); i++) {
                            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                                num_digits += 1;
                            }
                            num_chars += 1;
                        }
                    }
                } else {
                    current = "Error";
                    return;
                }
            }
            current = ss;

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
            BigDecimal bd = new BigDecimal(s);
            String ss = bd.toPlainString();

            int num_digs = 0;
            for (int i = 0; i < ss.length(); i++) {
                if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                    num_digs += 1;
                }
            }

            if (ss.length() > 11 || num_digs > 9) {
                if (ss.contains(".")) {
                    int count = 0;
                    for (int i = 0; i < ss.length(); i++) {
                        if (ss.charAt(i) == '.') {
                            break;
                        } else {
                            count += 1;
                        }
                    }
    
                    if (count > 9) {
                        current = "Error";
                        return;
                    } else {
                        ss = ss.substring(0,10);
                        num_digits = 0;
                        num_chars = 0;
                        for (int i = 0; i < ss.length(); i++) {
                            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                                num_digits += 1;
                            }
                            num_chars += 1;
                        }
                    }
                } else {
                    current = "Error";
                    return;
                }
            }
            current = ss;

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
            BigDecimal bd = new BigDecimal(s);
            String ss = bd.toPlainString();

            int num_digs = 0;
            for (int i = 0; i < ss.length(); i++) {
                if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                    num_digs += 1;
                }
            }

            if (ss.length() > 11 || num_digs > 9) {
                if (ss.contains(".")) {
                    int count = 0;
                    for (int i = 0; i < ss.length(); i++) {
                        if (ss.charAt(i) == '.') {
                            break;
                        } else {
                            count += 1;
                        }
                    }
    
                    if (count > 9) {
                        current = "Error";
                        return;
                    } else {
                        ss = ss.substring(0,10);
                        num_digits = 0;
                        num_chars = 0;
                        for (int i = 0; i < ss.length(); i++) {
                            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                                num_digits += 1;
                            }
                            num_chars += 1;
                        }
                    }
                } else {
                    current = "Error";
                    return;
                }
            }
            current = ss;

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
            BigDecimal bd = new BigDecimal(s);
            String ss = bd.toPlainString();

            int num_digs = 0;
            for (int i = 0; i < ss.length(); i++) {
                if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                    num_digs += 1;
                }
            }

            if (ss.length() > 11 || num_digs > 9) {
                if (ss.contains(".")) {
                    int count = 0;
                    for (int i = 0; i < ss.length(); i++) {
                        if (ss.charAt(i) == '.') {
                            break;
                        } else {
                            count += 1;
                        }
                    }
    
                    if (count > 9) {
                        current = "Error";
                        return;
                    } else {
                        ss = ss.substring(0,10);
                        num_digits = 0;
                        num_chars = 0;
                        for (int i = 0; i < ss.length(); i++) {
                            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                                num_digits += 1;
                            }
                            num_chars += 1;
                        }
                    }
                } else {
                    current = "Error";
                    return;
                }
            }
            current = ss;

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

    // Secondary Screen Functions
    public void digitTwo(String num) {
        if (current.equals("Error") || num_chars >= 18 || num_digits >= 16) {
            return;
        }

        if (current.equals("0")) {
            current = num;
        } else if (current.equals("-0")) {
            current = "-" + num;
        } else {
            current = current + num;
            num_chars += 1;
            num_digits += 1;
        }
    }

    public void decimalTwo() {
        if (current.equals("Error") || num_digits >= 16) {
            return;
        }

        if (decimal == false) {
            current = current + ".";
            decimal = true;
            num_chars += 1;
        }
    }

    public void percentTwo() {
        if (current.equals("Error") || current.equals("0")) {
            return;
        }

        String s = Double.toString(Double.valueOf(current)/100);
        BigDecimal bd = new BigDecimal(s);
        String ss = bd.toPlainString();

        int num_digs = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                num_digs += 1;
            }
        }

        if (ss.length() > 18 || num_digs > 16) {
            if (ss.contains(".")) {
                int count = 0;
                for (int i = 0; i < ss.length(); i++) {
                    if (ss.charAt(i) == '.') {
                        break;
                    } else {
                        count += 1;
                    }
                }

                if (count > 16) {
                    current = "Error";
                    return;
                } else {
                    ss = ss.substring(0,10);
                    num_digits = 0;
                    num_chars = 0;
                    for (int i = 0; i < ss.length(); i++) {
                        if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                            num_digits += 1;
                        }
                        num_chars += 1;
                    }
                }
            } else {
                current = "Error";
                return;
            }
        }
        current = ss;

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

    public void equalsTwo() {
        if (current.equals("Error")) {
            return;
        }

        if (operation.equals("add")) {
            String s = Double.toString(Double.valueOf(previous) + Double.valueOf(current));
            BigDecimal bd = new BigDecimal(s);
            String ss = bd.toPlainString();

            int num_digs = 0;
            for (int i = 0; i < ss.length(); i++) {
                if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                    num_digs += 1;
                }
            }

            if (ss.length() > 18 || num_digs > 16) {
                if (ss.contains(".")) {
                    int count = 0;
                    for (int i = 0; i < ss.length(); i++) {
                        if (ss.charAt(i) == '.') {
                            break;
                        } else {
                            count += 1;
                        }
                    }
    
                    if (count > 16) {
                        current = "Error";
                        return;
                    } else {
                        ss = ss.substring(0,10);
                        num_digits = 0;
                        num_chars = 0;
                        for (int i = 0; i < ss.length(); i++) {
                            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                                num_digits += 1;
                            }
                            num_chars += 1;
                        }
                    }
                } else {
                    current = "Error";
                    return;
                }
            }
            current = ss;

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
            BigDecimal bd = new BigDecimal(s);
            String ss = bd.toPlainString();

            int num_digs = 0;
            for (int i = 0; i < ss.length(); i++) {
                if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                    num_digs += 1;
                }
            }

            if (ss.length() > 18 || num_digs > 16) {
                if (ss.contains(".")) {
                    int count = 0;
                    for (int i = 0; i < ss.length(); i++) {
                        if (ss.charAt(i) == '.') {
                            break;
                        } else {
                            count += 1;
                        }
                    }
    
                    if (count > 16) {
                        current = "Error";
                        return;
                    } else {
                        ss = ss.substring(0,10);
                        num_digits = 0;
                        num_chars = 0;
                        for (int i = 0; i < ss.length(); i++) {
                            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                                num_digits += 1;
                            }
                            num_chars += 1;
                        }
                    }
                } else {
                    current = "Error";
                    return;
                }
            }
            current = ss;

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
            BigDecimal bd = new BigDecimal(s);
            String ss = bd.toPlainString();

            int num_digs = 0;
            for (int i = 0; i < ss.length(); i++) {
                if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                    num_digs += 1;
                }
            }

            if (ss.length() > 18 || num_digs > 16) {
                if (ss.contains(".")) {
                    int count = 0;
                    for (int i = 0; i < ss.length(); i++) {
                        if (ss.charAt(i) == '.') {
                            break;
                        } else {
                            count += 1;
                        }
                    }
    
                    if (count > 16) {
                        current = "Error";
                        return;
                    } else {
                        ss = ss.substring(0,10);
                        num_digits = 0;
                        num_chars = 0;
                        for (int i = 0; i < ss.length(); i++) {
                            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                                num_digits += 1;
                            }
                            num_chars += 1;
                        }
                    }
                } else {
                    current = "Error";
                    return;
                }
            }
            current = ss;

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
            BigDecimal bd = new BigDecimal(s);
            String ss = bd.toPlainString();

            int num_digs = 0;
            for (int i = 0; i < ss.length(); i++) {
                if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                    num_digs += 1;
                }
            }

            if (ss.length() > 18 || num_digs > 16) {
                if (ss.contains(".")) {
                    int count = 0;
                    for (int i = 0; i < ss.length(); i++) {
                        if (ss.charAt(i) == '.') {
                            break;
                        } else {
                            count += 1;
                        }
                    }
    
                    if (count > 16) {
                        current = "Error";
                        return;
                    } else {
                        ss = ss.substring(0,10);
                        num_digits = 0;
                        num_chars = 0;
                        for (int i = 0; i < ss.length(); i++) {
                            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                                num_digits += 1;
                            }
                            num_chars += 1;
                        }
                    }
                } else {
                    current = "Error";
                    return;
                }
            }
            current = ss;

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

    public void round() {
        if (current.equals("Error") || current.equals("0")) {
            return;
        }

        String s = Double.toString(Double.valueOf(current));
        BigDecimal bd = new BigDecimal(s);
        String ss = bd.toPlainString();

        int num_digs = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                num_digs += 1;
            }
        }

        if (ss.length() > 11 || num_digs > 9) {
            if (ss.contains(".")) {
                int count = 0;
                for (int i = 0; i < ss.length(); i++) {
                    if (ss.charAt(i) == '.') {
                        break;
                    } else {
                        count += 1;
                    }
                }

                if (count > 9) {
                    current = "Error";
                    return;
                } else {
                    ss = ss.substring(0,10);
                    num_digits = 0;
                    num_chars = 0;
                    for (int i = 0; i < ss.length(); i++) {
                        if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                            num_digits += 1;
                        }
                        num_chars += 1;
                    }
                }
            } else {
                current = "Error";
                return;
            }
        }
        current = ss;

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

    public void factorial() {
        /*if (current.equals("0") || decimal == true || negative == true) {
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
        }*/
    }

    public void sine() {
        /*String s = Double.toString(Math.sin(Double.valueOf(current)));
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
        }*/
    }

    public void cosine() {
        /*String s = Double.toString(Math.cos(Double.valueOf(current)));
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
        }*/
    }

    public void tangent() {
        /*String s = Double.toString(Math.tan(Double.valueOf(current)));
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
        }*/
    }

    public void arcsine() {
        /*String s = Double.toString(Math.asin(Double.valueOf(current)));
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
        }*/
    }

    public void arccosine() {
        /*String s = Double.toString(Math.acos(Double.valueOf(current)));
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
        }*/ 
    }

    public void arctangent() {
        /*String s = Double.toString(Math.atan(Double.valueOf(current)));
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
        }*/
    }

    public void enterEuler() {
        /*current = "2.718281828459045";*/
    }

    public void enterPi() {
        /*current = "3.141592653589793";*/
    }
}
package BackEnd;

import java.math.*;
import java.util.Random;

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
                    ss = ss.substring(0,17);
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
                        ss = ss.substring(0,17);
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
                        ss = ss.substring(0,17);
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
                        ss = ss.substring(0,17);
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
                        ss = ss.substring(0,17);
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
        } else if (operation.equals("exponent")) {
            String s = Double.toString(Math.pow(Double.valueOf(previous), Double.valueOf(current)));
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
                        ss = ss.substring(0,17);
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
        } else if (operation.equals("root")) {
            String s = Double.toString(Math.pow(Double.valueOf(previous), 1/Double.valueOf(current)));
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
                        ss = ss.substring(0,17);
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
        if (current.equals("Error") || current.equals("0") || decimal == true || negative == true) {
            return;
        }

        int num = 1;
        for (int i = 2; i <= Integer.valueOf(current); i++) {
            num = num * i;
        }
        String s = Integer.toString(num);

        if (s.length() > 16 || s.equals("0")) {
            current = "Error";
        } else {
            current = s;
        }
    }

    public void sine() {
        if (current.equals("Error")) {
            return;
        }

        String s = Double.toString(Math.sin(Double.valueOf(current)));
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
                    ss = ss.substring(0,17);
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

    public void cosine() {
        if (current.equals("Error")) {
            return;
        }

        String s = Double.toString(Math.cos(Double.valueOf(current)));
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
                    ss = ss.substring(0,17);
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

    public void tangent() {
        if (current.equals("Error")) {
            return;
        }

        String s = Double.toString(Math.tan(Double.valueOf(current)));
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
                    ss = ss.substring(0,17);
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

    public void arcsine() {
        if (current.equals("Error")) {
            return;
        }

        if (Double.valueOf(current) > 1 || Double.valueOf(current) < -1) {
            current = "Error";
            return;
        }

        String s = Double.toString(Math.asin(Double.valueOf(current)));
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
                    ss = ss.substring(0,17);
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

    public void arccosine() {
        if (current.equals("Error")) {
            return;
        }

        if (Double.valueOf(current) > 1 || Double.valueOf(current) < -1) {
            current = "Error";
            return;
        }

        String s = Double.toString(Math.acos(Double.valueOf(current)));
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
                    ss = ss.substring(0,17);
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

    public void arctangent() {
        if (current.equals("Error")) {
            return;
        }

        String s = Double.toString(Math.atan(Double.valueOf(current)));
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
                    ss = ss.substring(0,17);
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

    public void naturalLog() {
        if (current.equals("Error")) {
            return;
        }

        if (Double.valueOf(current) <= 0) {
            current = "Error";
            return;
        }

        String s = Double.toString(Math.log(Double.valueOf(current)));
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
                    ss = ss.substring(0,17);
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

    public void logarithm() {
        if (current.equals("Error")) {
            return;
        }

        if (Double.valueOf(current) <= 0) {
            current = "Error";
            return;
        }

        String s = Double.toString(Math.log10(Double.valueOf(current)));
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
                    ss = ss.substring(0,17);
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

    public void euler() {
        if (current.equals("Error")) {
            return;
        }

        String s = Double.toString(Math.exp(Double.valueOf(current)));
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
                    ss = ss.substring(0,17);
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

    public void random() {
        Random rand = new Random();
        String s = Double.toString(rand.nextDouble(1));
        BigDecimal bd = new BigDecimal(s);
        String ss = bd.toPlainString();

        int num_digs = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                num_digs += 1;
            }
        }

        if (ss.length() > 18 || num_digs > 16) {
            ss = ss.substring(0,17);
            num_digits = 0;
            num_chars = 0;
            for (int i = 0; i < ss.length(); i++) {
                if (ss.charAt(i) != '.' && ss.charAt(i) != '-') {
                    num_digits += 1;
                }
                num_chars += 1;
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

    public void enterEuler() {
        current = "2.718281828459045";

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

    public void enterPi() {
        current = "3.141592653589793";

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

    public void exponent() {
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
        operation = "exponent";
    }

    public void root() {
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
        operation = "root";
    }
}
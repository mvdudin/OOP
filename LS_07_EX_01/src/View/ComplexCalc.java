package View;

import Model.Complex;
import java.util.Scanner;
import Controller.ComplexController;
public class ComplexCalc {
    Scanner term;
    ComplexController complex;
    public ComplexCalc() {
        this.term = new Scanner(System.in);
        this.complex = new ComplexController();
    }
    public void run() {
        Complex c1;
        Complex c2;
        String sign;

        while (true) {
            System.out.println("EXIT - close calculator");
            System.out.println("CALC - new calculation");
            if (readCommand().equalsIgnoreCase("EXIT") ) break;
            try {
                do {
                    c1 = complex.toComplex(readComplex());
                } while (c1 == null);
                sign = readSign();
                do {
                    c2 = complex.toComplex(readComplex());
                } while (c2 == null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            switch (sign) {
                case "+":
                    System.out.println(complex.sum(c1, c2));
                    break;
                case "-":
                    System.out.println(complex.diff(c1, c2));
                    break;
                case "*":
                    System.out.println(complex.mult(c1, c2));
                    break;
                case "/":
                    System.out.println(complex.div(c1, c2));
                    break;
            }
        }
    }

    private String readComplex(){
        System.out.println("Input complex number a+ib");
        String r = prompt("Input real part a: ");
        String i = prompt("Input image part b: ");
        return r.concat(";").concat(i);
    }
    private String readCommand(){
        String s;
        do {
            s = prompt("Input command: ").toUpperCase();
        } while (!(s.equals("EXIT") || s.equals("CALC")));
        return s;
    }
    private String readSign(){
        String s;
        do {
            s = prompt("Input math operation (+, -, *, /) : ").toUpperCase();
        } while (!(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")));
        return s;
    }
    private String prompt(String message) {
        System.out.print(message);
        return term.nextLine();
    }

}

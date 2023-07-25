package Controller;

import Logger.Log;
import Model.Complex;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComplexController {
    private static final Logger log = Log.log(ComplexController.class.getName());
    public Complex toComplex(String c) throws NumberFormatException {
       try {
           String[] lines = c.split(";");
           Complex z = new Complex(Double.parseDouble(lines[0]), Double.parseDouble(lines[1]));
           log.log(Level.INFO, "Convert ".concat(c).concat(" to ").concat(z.toString()));
           return z;
       }
       catch (NumberFormatException e){
           log.log(Level.WARNING, "Can not convert ".concat(c).concat(" to Complex"));
           return null;
       }
    }
    public String sum(Complex c1, Complex c2){
      Complex r = c1.plus(c2);
      String result = c1.toString().concat(" + ").concat(c2.toString()).concat(" = ").concat(r.toString());
      log.log(Level.INFO, result);
      return result;
    }

    public String diff(Complex c1, Complex c2){
        Complex r = c1.minus(c2);
        String result = c1.toString().concat(" - ").concat(c2.toString()).concat(" = ").concat(r.toString());
        log.log(Level.INFO, result);
        return result;
    }
    public String mult(Complex c1, Complex c2){
        Complex r = c1.multiply(c2);
        String result = c1.toString().concat(" * ").concat(c2.toString()).concat(" = ").concat(r.toString());
        log.log(Level.INFO, result);
        return result;
    }

    public String div(Complex c1, Complex c2){
        try {
            Complex r = c1.divide(c2);
            String result = c1.toString().concat(" / ").concat(c2.toString()).concat(" = ").concat(r.toString());
            log.log(Level.INFO, result);
            return result;
        }
        catch (ArithmeticException e){
            log.log(Level.WARNING, c1.toString().concat(" / ").concat(c2.toString()).concat("Unknown result. Division by zero"));
            return "Unknown result. Division by zero";
        }
    }
}

package Model;

public class Complex {
    double r; // реальная часть
    double i; // мнимая часть
    public Complex (double r, double i) {
        this.r = r;
        this.i = i;
    }
    public double getR() {
        return r;
    }
    public double getI() {
        return i;
    }
    public Complex plus(Complex c){
        return new Complex(r+c.getR(), i+c.getI());
    }
    public Complex minus(Complex c){
        return new Complex(r-c.getR(), i-c.getI());
    }
    public Complex multiply(Complex c){
        //a+bi * c+di = (ac-bd) + (bc+ad)i
        return new Complex(((r*c.getR()) - (i*c.getI())), ((i*c.getR())+(r*c.getI())));
    }
    public Complex divide(Complex c){
        //a+bi / c+di = (ac+bd)/(c2+d2) + (bc-ad)/(c2+d2)i
        if (c.getR() == 0 & c.getI() == 0)
            throw new ArithmeticException();
        double t = (c.getR()*c.getR())+(c.getI()*c.getI());
        return new Complex(((r*c.getR())+(i*c.getI()))/t, ((i*c.getR())-(r*c.getI()))/t);
    }

    @Override
    public String toString() {
        return String.format("(%f+%fi)", r, i);
    }
}

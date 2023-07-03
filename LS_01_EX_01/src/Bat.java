package LS_01_EX_01;
public class Bat extends Animal{
    public Bat(String color, String species ) {
        super(null, null, 2);
    }
    @Override
    public void fly() {
        System.out.println("Bat fly");
    }

}

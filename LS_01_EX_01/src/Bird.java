package LS_01_EX_01;
public class Bird extends Animal{
    public Bird(String color, String species ) {

        super(null, null, 2);
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

}

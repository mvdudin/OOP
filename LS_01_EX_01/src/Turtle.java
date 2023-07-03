package LS_01_EX_01;

public class Turtle extends Animal {
    public Turtle(String color, String species ) {

        super(null, null, 0);
    }

    @Override
    public void swim() {

        System.out.println("Turtle swim");
    }
}

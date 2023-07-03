package LS_01_EX_01;
public class Penguin extends Animal {
    public Penguin(String color, String species ) {
        super(null, null, 2);
    }
    @Override
    public void toGo() {
        System.out.println("Penguin run");
    }
}

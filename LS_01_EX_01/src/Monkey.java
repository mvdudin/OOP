package LS_01_EX_01;
public class Monkey extends Animal{
    public Monkey(String color, String species ) {
        super(null, null, 2);
    }
    @Override
    public void toGo() {
        System.out.println("Monkey run");
    }
}

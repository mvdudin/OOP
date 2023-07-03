package LS_01_EX_01;
public class Fish extends Animal {
    public Fish(String color, String species ){
        super(null, null, 0);
    }

    @Override
    public void swim() {
        System.out.println("Fish swim");
    }
}


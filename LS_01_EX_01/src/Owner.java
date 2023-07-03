package LS_01_EX_01;
public class Owner {
    private String name;
    public Owner(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
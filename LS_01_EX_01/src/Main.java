import LS_01_EX_01.Fish;
import LS_01_EX_01.Turtle;
import LS_01_EX_01.Bird;
import LS_01_EX_01.Bat;
import LS_01_EX_01.Monkey;
import LS_01_EX_01.Penguin;

public class Main {
    public static void main(String[] args) {
        Fish fish_1 = new Fish(null, null);
        fish_1.swim();

        Turtle turtle_1 = new Turtle(null, null);
        turtle_1.swim();

        Bird bird_1 = new Bird(null, null);
        bird_1.fly();

        Bat bat_1 = new Bat(null, null);
        bat_1.fly();

        Monkey monkey_1 = new Monkey(null, null);
        monkey_1.toGo();

        Penguin penguin_1 = new Penguin(null, null);
        penguin_1.toGo();

    }
}
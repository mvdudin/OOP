package homework;

public class Main{
    public static void main(String[] args){
        SimpleUser user = new SimpleUser("Bob");
        Persister storage = new Persister(user);
        Report report = new Report();
        report.generate(user);
        storage.save();
    }
}
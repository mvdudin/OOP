package homework;

public class SimpleUser implements User {
    protected String name;
    public SimpleUser (String name){
       this.name = name;
    }
    public String getName(){
        return name;
    }
}

package ru.gb.lessons.interfaces.core.personal;

public abstract class Medic {
    protected final String CLASS_NAME = "The " + getClass().getSimpleName();
    protected int id; //ид сотрудника клиники
    protected String surname;
    protected String name;
    protected String patronymic;
    protected String position; // должность
    protected String level; //образование

    public Medic(String surname, String name, String patronymic, String positionm, String level){
       this.surname = surname;
       this.name = name;
       this.patronymic = patronymic;
       this.position = positionm;
       this.level = level;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurnameNamePatronymic() {
        return surname.concat(" ").concat(name).concat(" ").concat(patronymic);
    }
    public String getClassName() {
        return this.CLASS_NAME;
    }

    @Override
    public String toString() {
        return level.concat(getSurnameNamePatronymic());
    }
}

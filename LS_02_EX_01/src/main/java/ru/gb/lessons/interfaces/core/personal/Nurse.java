package ru.gb.lessons.interfaces.core.personal;
public class Nurse extends Medic implements Nurses{
    public Nurse(String surname, String name, String patronymic){
        super(surname, name, patronymic, "младший мед. персонал", "мед.сестра");
    }
    public void Assist(){
    };

}

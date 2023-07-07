package ru.gb.lessons.interfaces.core.personal;

import ru.gb.lessons.interfaces.core.clients.Animal;

public class Doctor extends Medic implements Doctors{
    public Doctor(String surname, String name, String patronymic, String position){
        super(surname, name, patronymic, position, "доктор мед. наук");
    }
    public void consult(Nurses assistant, Animal animal){
        System.out.println(toString());
        System.out.println("осмотрел");
        System.out.println(animal);
        System.out.println("асистент");
        System.out.println(assistant);
    };

    public void heal(Nurses assistant, Animal animal){
        System.out.println(toString());
        System.out.println("вылечил");
        System.out.println(animal);
        System.out.println("асистент");
        System.out.println(assistant);
    };
}

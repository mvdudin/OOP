package ru.gb.lessons.interfaces.core;

import java.util.ArrayList;
import java.util.List;

import ru.gb.lessons.interfaces.core.clients.*;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>(); 
    public static void main(String[] args) {
        Human human = new Human("Пайтон");
        Cat cat = new Cat(0, null, 0, null, null);
        // animals.add(human);
        animals.add(cat);

        for (Animals element: animals) {
            heal(element);
        }    
    }
    private static void heal(Animals animal) {
        System.out.println(animal.getClassName() + "вылечен");
    }
    public List<Animals> getRunnable(){
        List<Animals> result = new ArrayList<Animals>();
        for (Animals item: animals) {
            if (item instanceof Runnable) result.add(item);
        }
        return result;
    }
    public List<Animals> getSwimable(){
        List<Animals> result = new ArrayList<Animals>();
        for (Animals item: animals) {
            if (item instanceof Swimable) result.add(item);
        }
        return result;
    }
    public List<Animals> getSoundable(){
        List<Animals> result = new ArrayList<Animals>();
        for (Animals item: animals) {
            if (item instanceof Soundable) result.add(item);
        }
        return result;
    }
    public List<Animals> getFlyable(){
        List<Animals> result = new ArrayList<Animals>();
        for (Animals item: animals) {
            if (item instanceof Flyable) result.add(item);
        }
        return result;
    }
}


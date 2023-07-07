package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Runnable, Swimable,  Soundable {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
    @Override
    public int swim() {
        System.out.println(CLASS_NAME + "плывет со скоростью: 3 км/ч");
        return 3;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "бегает со скоростью: 10 км/ч");
        return 10;
    }

    @Override
    public int cry() {
        System.out.println(CLASS_NAME + "Лает с горомкостью: 5 Дб");
        return 5;
    }
}

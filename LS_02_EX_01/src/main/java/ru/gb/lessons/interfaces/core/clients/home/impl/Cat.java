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
public class Cat extends Pet implements Runnable, Swimable, Soundable {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
    @Override
    public int swim() {
        System.out.println(CLASS_NAME + "плывет со скоростью: 1 км/ч");
        return 1;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "бегает со скоростью: 12 км/ч");
        return 12;
    }

    @Override
    public int cry() {
        System.out.println(CLASS_NAME + " Мяукает с горомкостью: 12 Дб");
        return 12;
    }
}

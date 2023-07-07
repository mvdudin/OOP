package ru.gb.lessons.interfaces;

import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.personal.Doctor;
import ru.gb.lessons.interfaces.core.personal.Nurse;

import java.time.LocalDate;

/**
 Небольшая шпаргалка по синтаксису java:

 1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
 3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
 -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {
        Cat homeCat =
                new Cat(2, "Tom", 4, LocalDate.of(2022, 4,13), new Owner("Ivanov Ivan"));

        ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat wildCat =
                new ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat(
                        1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));

        homeCat.hunt();
        wildCat.hunt();

        Doctor surgeon = new Doctor("Иванов", "Иван", "Иванович", "хирург");
        Nurse  surgeonNurse = new Nurse("Петрова", "Ольга", "Ивановна");

        surgeon.consult(surgeonNurse, homeCat);
        surgeon.heal(surgeonNurse, wildCat);
    }
}

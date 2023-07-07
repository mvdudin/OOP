package ru.gb.lessons.interfaces.core.personal;

import ru.gb.lessons.interfaces.core.clients.Animal;

public interface Doctors {
    void consult(Nurses assistant, Animal animal);

    void heal(Nurses assistant, Animal animal);
}

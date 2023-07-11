package ru.gb.lessons.interfaces.core.drugStore;

import org.w3c.dom.ls.LSSerializer;
import ru.gb.lessons.interfaces.core.clients.DoctorSpecialities;
import ru.gb.lessons.interfaces.core.personal.Doctor;

import java.io.Serializable;
import java.util.*;

import static ru.gb.lessons.interfaces.core.clients.DoctorSpecialities.THERAPIST;

public class Main {
    public static void main(String[] args) {
        Set<Pharmacy> pharmSet = new HashSet<>();
        Pharmacy pharm1 = new Pharmacy(10);
        Component c1 = new Component("C4", "10", 10);
        Component c2 = new Component("C3", "10", 1000);
        pharm1.add(c1).add(c2);
        System.out.println(pharm1.getComponentsName());
        pharmSet.add(pharm1);

        Pharmacy pharm2 = new Pharmacy(10);
        c1 = new Component("C3", "10", 10);
        c2 = new Component("C4", "10", 1000);
        pharm2.add(c1).add(c2);
        System.out.println(pharm2.getComponentsName());
        System.out.println(pharm2.compareTo(pharm1));
        pharmSet.add(pharm2);

        Pharmacy pharm3 = new Pharmacy(17);
        c1 = new Component("C99", "10", 10);
        c2 = new Component("C6", "10", 1000);
        pharm3.add(c1).add(c2);
        System.out.println(pharm3.getComponentsName());
        pharmSet.add(pharm3);

        System.out.println(pharmSet.size());
    }
}

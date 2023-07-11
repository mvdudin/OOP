package ru.gb.lessons.interfaces.core.drugStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Marker {
    private int id;
    private int componentsCount;
    private List<Component> components;
    public Pharmacy(int id) {
        this.id = id;
        this.componentsCount = 0;
        this.components = new ArrayList<>();
    }
    public Pharmacy add (Component o) {
        this.components.add(o);
        this.componentsCount++;
        return this;
    }
    public List<Component> getComponents() {
        return components;
    }
    @Override
    public String toString() {
        return "Pharmacy{ components=" + components + ", index=" + componentsCount +"} Total power = "+this.getPower()+"\n";
    }
    @Override
    public Iterator<Component> iterator() { return new ComponentIterator(); }
    @Override
    public int compareTo(Pharmacy o) {
        int result = Integer.compare(this.getPower(), o.getPower());
        if (result == 0) { result = this.getComponentsName().compareTo(o.getComponentsName());}
        return result;
    }
    public int getPower() {
        int result = 0;
        for (Component elem: getComponents()) {
            result += elem.getPower();
        }
        return result;
    }
    public String getComponentsName(){
        List names = new ArrayList<String>();
        for (Component item:this.components) {
            names.add(item.getName());
        }
       Collections.sort(names);
       return names.toString();
    }
    @Override
    public boolean equals(Object o) { return this.getId() == ((Pharmacy)o).getId(); }
    public int getId() { return id; }
    @Override
    public int hashCode() {
        return ((Integer)id).hashCode();
    }
}

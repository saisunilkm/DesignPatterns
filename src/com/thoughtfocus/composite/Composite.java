package com.thoughtfocus.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }
    public void addComponents(Component component){
        components.add(component);
    }

    @Override
    public void price() {
        System.out.println(name);
        for(Component component : components){
            component.price();
        }

    }
}

package ru.kpfu.itis.springControllers.services;

import java.util.ArrayList;
import java.util.List;

public class Service {


    private static List<String> types = new ArrayList<>();

    private static void addTypes(){
        types.add("Electronic");
        types.add("Cyperpunk");
    }


    public static List<String> getTypes(){
        addTypes();
        return types;
    }
}

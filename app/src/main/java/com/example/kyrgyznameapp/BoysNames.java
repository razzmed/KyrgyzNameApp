package com.example.kyrgyznameapp;

public class BoysNames {

    private String name;
    private String description;

    private BoysNames(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static final BoysNames[] boysNames = {
            new BoysNames("Абаз", "Имя Абаз переводится с кыргызского как - звук, голос"),
            new BoysNames("Абдан", "Имя Абдан переводится с кыргызского как - очень. Часто встречается как Абданбек - очень крепкий. " +
                    "Такое имя дается, чтобы ребенок был здоровым и крепким"),
            new BoysNames("Абай", "Имя Абай переводится с кыргызского как - буть осторожен"),
            new BoysNames("Адилет", "Имя Адилет (Адиль, Адыл, Адылбек) переводится с кыргызского как - справедливость, правда")
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return this.name;
    }
}

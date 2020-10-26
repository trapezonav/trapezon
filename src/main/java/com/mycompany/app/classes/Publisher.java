package com.mycompany.app.classes;

public enum Publisher {
    VIKING("Viking Press & Signet Books"),BLOOMSBURY("Bloomsbury");

    private String name;

    Publisher(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

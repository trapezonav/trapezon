package com.mycompany.app.classes;

public enum Author {
    KESEY("Ken Kesey"),ROWLING("J. K. Rowling"),SHAKESPEARE("William Shakespeare");

    private String fullName;

    Author(String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}

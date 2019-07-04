package com.company.carservice;

public enum Specialization {

    Oculist("Oculist"),
    Cardiologist("Cardiologist"),
    Neurologist("Neurologist"),
    Surgeon("Surgeon"),
    Pediatrician("Pediatrician");

    private String name;
    Specialization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package com.company.carservice;

import java.util.Scanner;

public class Doctor {
    Specialization doc;
    int price;
    String doctor;

    private Doctor(String doctor) {
        this.doctor = doctor;
    }

    private void createDoctor(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("What kind of doctor do you need?");
        doctor=scanner.nextLine();
        Doctor doctor1=new Doctor(doctor);
    }

    public Doctor() {
        createDoctor();
    }

    public String getdoctor(){
        switch (doc) {
            case Oculist:
                doc.getName();
                break;
            case Cardiologist:
                doc.getName();
                break;
            case Neurologist:
                doc.getName();
                break;
            case Surgeon:
                doc.getName();
                break;
            case Pediatrician:
                doc.getName();
                break;
        }
        return doctor;
    }

    public int getPrice(){
        switch (doc) {
            case Oculist:
                price=5000;
                break;
            case Cardiologist:
                price=5000;
                break;
            case Neurologist:
                price=5000;
                break;
            case Surgeon:
                price=5000;
                break;
            case Pediatrician:
                price=5000;
                break;
        }
        return price;
    }
}

package com.company.carservice;

import java.util.Scanner;

public class Patients {

    private String name;
    private int bornYear;
    private Doctor doctor;

    public Patients() {
        createPatient();
    }

    private void createPatient(){
        Patients patients=new Patients(getName(), getBornYear(), getDoctor());
    }

    private Patients(String name, int bornYear, Doctor doctor) {
        this.name = name;
        this.bornYear = bornYear;
        this.doctor = doctor;
    }


    private String getName() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write Your name");
        String name=scanner.nextLine();
        return name;
    }

    private int getBornYear() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write Your born year");
        int bornYear=scanner.nextInt();
        return bornYear;
    }

    private Doctor getDoctor() {
        Doctor doctor = new Doctor();
        return doctor;
    }

    @Override
    public String toString() {

        return "Name = " + getName() + " year = " + getBornYear() + " Doctor = " + getDoctor();
    }
}
